package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005116 Number of protruded partitions of n with largest part at most 10.
 * @author Sean A. Irvine
 */
public class A005116 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.pow(Polynomial.create(1, -1), 10);
  private static final Polynomial<Z> DEN;

  static {
    Polynomial<Z> d = RING.one();
    for (int k = 1; k <= 10; ++k) {
      final Polynomial<Z> t = RING.add(RING.subtract(Polynomial.create(1, -1), RING.monomial(Z.ONE, k)), RING.monomial(Z.ONE, 1 + 2 * k));
      d = RING.multiply(d, t);
    }
    DEN = d;
  }

  private int mN = 0;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

