package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005940 The Doudna sequence: write <code>n-1</code> in binary; power of <code>p_k</code> in <code>a(n)</code> is # of <code>1</code>'s that are followed by <code>k-1 0</code>'s.
 * @author Sean A. Irvine
 */
public class A005940 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long m = mN++;
    Z prod = Z.ONE;
    Z p = Z.TWO;
    do {
      if ((m & 1) == 1) {
        prod = prod.multiply(p);
      } else {
        p = mPrime.nextPrime(p);
      }
    } while ((m >>>= 1) > 0);
    return prod;
  }
}
