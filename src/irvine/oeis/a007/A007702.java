package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007702 <code>a(n) = prime(n)*...*prime(m)</code>, the least product of consecutive primes which is <code>non-deficient</code>.
 * @author Sean A. Irvine
 */
public class A007702 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long p = mP;
    final FactorSequence fs = new FactorSequence();
    Z prod = Z.TWO.multiply(mP);
    fs.add(mP, FactorSequence.PRIME);
    while (true) {
      if (fs.sigma().compareTo(prod) >= 0) {
        return prod.divide2();
      }
      p = mPrime.nextPrime(p);
      fs.add(p, FactorSequence.PRIME);
      prod = prod.multiply(p);
    }
  }
}
