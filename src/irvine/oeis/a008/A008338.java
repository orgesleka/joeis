package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008338 <code>a(n+1) = a(n)/n!</code> if <code>n!</code> divides <code>a(n)</code> else <code>a(n)*n!</code>.
 * @author Sean A. Irvine
 */
public class A008338 implements Sequence {

  private Z mA = Z.ONE;
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      final Z[] qr = mA.divideAndRemainder(mF);
      if (Z.ZERO.equals(qr[1])) {
        mA = mA.divide(mF);
      } else {
        mA = mA.multiply(mF);
      }
    }
    return mA;
  }
}


