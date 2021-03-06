package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001615 Dedekind psi function: <code>n * Product_{p|n, p</code> prime} <code>(1 + 1/p)</code>.
 * @author Sean A. Irvine
 */
public class A001615 implements Sequence {

  private long mN = 0;

  /**
   * Dedekind psi function.
   * @param n number
   * @return <code>psi(n)</code>
   */
  public static Z dedekindPsi(final long n) {
    Z prod = Z.valueOf(n);
    for (final Z p : Cheetah.factor(n).toZArray()) {
      prod = prod.divide(p).multiply(p.add(1));
    }
    return prod;
  }

  @Override
  public Z next() {
    return dedekindPsi(++mN);
  }

}
