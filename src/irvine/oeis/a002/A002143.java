package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002143 Class numbers <code>h(-p)</code> where p runs through the primes p <code>== 3 (mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A002143 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 3) == 3) {
        return Z.valueOf(LongUtils.classNumber(-mP));
      }
    }
  }
}
