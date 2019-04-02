package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007945 Expansion of (2-x-2*x^2)/((1-x)*(1-x+x^2)).
 * @author Sean A. Irvine
 */
public class A007945 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(2, -1, -2);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -2, 2, -1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
