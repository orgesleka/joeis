package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009220 <code>Sum(a(n)*x^n/n!) = exp(sinh(sinh(x)))</code>.
 * @author Sean A. Irvine
 */
public class A009220 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.sinh(RING.sinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
