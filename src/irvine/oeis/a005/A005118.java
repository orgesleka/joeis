package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005118 Number of simple allowable sequences on <code>1..n</code> containing the permutation <code>12...n</code>.
 * @author Sean A. Irvine
 */
public class A005118 implements Sequence {

  private MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    final int h = Binomial.binomial(++mN, 2).intValueExact();
    Z r = mF.factorial(h);
    Z g = Z.ONE;
    for (int k = mN - 2; k >= 1; --k) {
      g = g.add(2);
      r = r.divide(g.pow(k));
    }
    return r;
  }
}

