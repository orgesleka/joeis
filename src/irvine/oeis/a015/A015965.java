package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015965 Numbers n such that <code>n | 14^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A015965 implements Sequence {

  private static final Z Z14 = Z.valueOf(14);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z14.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
