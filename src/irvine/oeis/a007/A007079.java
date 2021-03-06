package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007079 Number of labeled regular tournaments with <code>2n+1</code> nodes.
 * @author Sean A. Irvine
 */
public class A007079 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    MultivariatePolynomial p = MultivariatePolynomial.one(mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, (mN - 1) / 2);
    final Z[] coeff = new Z[2];
    Arrays.fill(coeff, Z.ONE);
    for (int k = 0; k < mN; ++k) {
      for (int j = k + 1; j < mN; ++j) {
        final int[][] t = new int[2][mN];
        t[0][k] = 1;
        t[1][j] = 1;
        final MultivariatePolynomial xkxj = new MultivariatePolynomial(mN, t, coeff);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits));
  }
}
