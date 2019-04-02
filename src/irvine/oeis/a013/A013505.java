package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013505 arcsin(sec(x)-sech(x))=2/2!*x^2+242/6!*x^6+680642/10!*x^10...
 * @author Sean A. Irvine
 */
public class A013505 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.asin(RING.subtract(RING.sec(RING.x(), mN), RING.sech(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
