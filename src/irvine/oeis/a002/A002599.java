package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.IntegerField;

/**
 * A002599 A generalized partition function.
 * @author Sean A. Irvine
 */
public class A002599 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mDen = RING.one();
  private int mN = 0;

  protected int limit() {
    return 5;
  }

  @Override
  public Z next() {
    if (++mN <= limit()) {
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(mN), mN));
    }
    final int t = Math.max(limit(), mN);
    return RING.coeff(RING.one(), mDen, t);
  }
}
