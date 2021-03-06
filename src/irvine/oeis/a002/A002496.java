package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002496 Primes of the form <code>n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A002496 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.ZERO.equals(mP.subtract(1).sqrtAndRemainder()[1])) {
        return mP;
      }
    }
  }
}
