package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001849 Crystal ball sequence for 7-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A001849 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.pow(Polynomial.create(1, 1), 7);
  private static final Polynomial<Z> DEN = RING.pow(Polynomial.create(1, -1), 8);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
