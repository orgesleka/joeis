package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000279 Card matching: coefficients <code>B[n,1]</code> of t in the reduced hit polynomial <code>A[n,n,n](t)</code>.
 * @author Sean A. Irvine
 */
public class A000279 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      s = s.add(mF.factorial(mN).divide(mF.factorial(k)).square()
                .divide(mF.factorial(mN - k - 1))
                .divide(mF.factorial(mN - k))
                .multiply(mF.factorial(mN - 1))
                .divide(mF.factorial(k + 1))
                .divide(mF.factorial(mN - 1 - k)));
    }
    return s.multiply(3 * mN);
  }
}
