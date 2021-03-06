package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161792 If <code>b(n)</code> is the number of <code>1</code>'s in the binary representation of n, then the positive integer n is included if <code>n = k^b(n)</code>, for some k = integer.
 * @author Sean A. Irvine
 */
public class A161792 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int pop = mN.bitCount();
      if (pop == 1) {
        return mN;
      }
      mN.root(pop); // ses auxiliary
      if (mN.auxiliary() == 1) {
        return mN;
      }
    }
  }
}

