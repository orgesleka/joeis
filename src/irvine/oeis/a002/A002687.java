package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A002687 Numerators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002687 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  protected Q a(final int n) {
    Polynomial<Q> f = RING.one();
    for (int k = 0; k < n; ++k) {
      f = RING.multiply(f, RING.create(Arrays.asList(new Q(-k), Q.ONE)));
    }
    f = RING.integrate(f);
    f = RING.integrate(f);
    final Q definite = RING.eval(f, Q.ONE);
    return definite.divide(mF.factorial(n));
  }
  
  @Override
  public Z next() {
    return a(++mN).num();
  }
}
