package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012742 <code>arctan(arctanh(x)*cos(x))=x-3/3!*x^3+53/5!*x^5-1799/7!*x^7..</code>.
 * @author Sean A. Irvine
 */
public class A012742 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.multiply(RING.atanh(RING.x(), mN), RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
