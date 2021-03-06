package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

/**
 * A002455 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A002455 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 2) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Q c = RING.pow(RING.asin(RING.x(), mN), 4, mN).coeff(mN);
    return c.multiply(mF).toZ().divide(24);
  }
}
