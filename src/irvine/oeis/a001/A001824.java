package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001824 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A001824 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(Z.valueOf(2 * mN + 1).square());
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.add(mF.divide(Z.valueOf(2 * k + 1).square()));
    }
    return s;
  }
}
