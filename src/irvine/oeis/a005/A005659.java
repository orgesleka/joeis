package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005659 If n appears so do <code>2n-2</code> and <code>3n-3</code>.
 * @author Sean A. Irvine
 */
public class A005659 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.FOUR);
  }

  @Override
  public Z next() {
    final Z res = mPriority.pollFirst();
    mPriority.add(res.multiply2().subtract(2));
    mPriority.add(res.multiply(3).subtract(3));
    return res;
  }
}

