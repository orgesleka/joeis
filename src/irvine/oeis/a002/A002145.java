package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002145 Primes of the form <code>4n+3</code>.
 * @author Sean A. Irvine
 */
public class A002145 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(4) == 3) {
        return mP;
      }
    }
  }
}
