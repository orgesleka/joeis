package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006515 Mersenne numbers with at most 2 prime factors.
 * @author Sean A. Irvine
 */
public class A006515 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z n = Z.ONE.shiftLeft((int) mP).subtract(1);
      if (Jaguar.factor(n).omega() < 3) {
        return n;
      }
    }
  }
}
