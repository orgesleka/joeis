package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018937 Consider smallest m such that <code>m^2 = x_1^2 +</code> ... <code>+ x_n^2</code> with <code>0 &lt; x_1 &lt</code>; ... <code>&lt; x_n</code>. Sequence gives least value of <code>x_n</code>.
 * @author Sean A. Irvine
 */
public class A018937 implements Sequence {

  private int mN = 0;
  private long mSumSquares;

  static long leastSolution(final long s, final int n, final long b) {
    if (n == 0) {
      return s == 0 ? b : Long.MAX_VALUE;
    }
    long c = b + 1;
    long sq;
    long soln = Long.MAX_VALUE;
    while ((sq = c * c) <= s) {
      soln = Math.min(soln, leastSolution(s - sq, n - 1, c));
      if (++c >= soln) {
        return soln;
      }
    }
    return soln;
  }

  @Override
  public Z next() {
    ++mN;
    mSumSquares += mN * mN;
    long m = LongUtils.sqrt(mSumSquares);
    while (true) {
      final long soln = leastSolution(m * m, mN, 0);
      if (soln != Long.MAX_VALUE) {
        return Z.valueOf(soln);
      }
      ++m;
    }
  }
}

