package irvine.math.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.api.Set;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.util.string.Date;
import irvine.util.string.StringUtils;

/**
 * A group expressed as integer permutations.  Used for efficiency in several
 * otherwise large and difficult to construct groups.  Delays computation of
 * all members until needed.
 * @author Sean A. Irvine
 */
public class IntegerPermutationGroup extends AbstractGroup<IntegerPermutation> {

  private final Set<IntegerPermutation> mElements;
  private final TreeSet<IntegerPermutation> mMembers = new TreeSet<>();
  private final IntegerPermutation mZero;
  private final boolean mVerbose;
  private List<BaseStrongGeneratingElement> mBsgs = null;

  /**
   * Construct a new subgroup generated by elements in the given group.
   * @param permSize size of parent permutation
   * @param elements base elements for generator
   * @param verbose if true report on the construction process
   * @throws UnsupportedOperationException if the underlying group is infinite.
   */
  public IntegerPermutationGroup(final int permSize, final Set<IntegerPermutation> elements, final boolean verbose) {
    if (elements == null) {
      throw new NullPointerException();
    }
    // This implementation explicitly computes all the members, so
    // it cannot deal with infinite sets reliably.  In fact it will
    // overflow if there are more than 2^31 elements.
    elements.abortOnInfinite();
    mZero = new IntegerPermutation(IntegerUtils.identity(new int[permSize]));
    mElements = elements;
    mVerbose = verbose;
  }

  private void init() {
    if (mMembers.isEmpty()) {
      final LinkedList<IntegerPermutation> queue = new LinkedList<>();
      queue.add(mZero);
      mMembers.add(mZero);
      while (!queue.isEmpty()) {
        final IntegerPermutation f = queue.pollFirst();
        for (final IntegerPermutation e : mElements) {
          final IntegerPermutation next = e.compose(f);
          if (mMembers.add(next)) {
            queue.add(next);
            if (mVerbose && (mMembers.size() & 0xFFFF) == 0) {
              System.out.println(Date.now() + "Size: " + mMembers.size());
            }
          }
        }
      }
    }
  }

  @Override
  public IntegerPermutation zero() {
    return mZero;
  }

  private void initBsgs() {
    if (mBsgs == null) {
      final ArrayList<IntegerPermutation> generators = new ArrayList<>(mElements.size().intValueExact());
      for (final IntegerPermutation gen : mElements) {
        generators.add(gen);
      }
      mBsgs = SchreierSims.createBSGSList(generators);
    }
  }

  @Override
  public Z size() {
    initBsgs();
    return SchreierSims.calculateOrder(mBsgs);
  }

  private Boolean mAbelian = null;
  
  @Override
  public boolean isAbelian() {
    if (mAbelian == null) {
      init();
      mAbelian = GroupUtils.isAbelian(this); // expensive test
    }
    return mAbelian;
  }

  @Override
  public boolean contains(final IntegerPermutation a) {
    init();
    return mMembers.contains(a);
  }

  @Override
  public IntegerPermutation add(final IntegerPermutation a, final IntegerPermutation b) {
//    checkContains(a);
//    checkContains(b);
    return b.compose(a);
  }

  @Override
  public IntegerPermutation negate(final IntegerPermutation a) {
//    checkContains(a);
    return a.inverse();
  }

  @Override
  public Iterator<IntegerPermutation> iterator() {
    init();
    return mMembers.iterator();
  }

  @Override
  public String toString() {
    return "<" + StringUtils.toString(mElements, ",") + ">";
  }
}
