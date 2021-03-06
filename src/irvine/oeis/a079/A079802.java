package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A079802 Group the prime numbers so that the sum of the terms of the n-th group is a multiple of that of the <code>(n-1)-st</code> group: <code>(2), (3,5), (7,11,13,17), (19,23,29,31,37...,79,83)</code>, ...; <code>a(n) =</code> sum of n-th group.
 * @author Sean A. Irvine
 */
public class A079802 implements Sequence {

  private long mP = 1;
  private Z mPrev = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    do {
      mP = mPrime.nextPrime(mP);
      sum = sum.add(mP);
    } while (sum.compareTo(mPrev) < 0 || !Z.ZERO.equals(sum.mod(mPrev)));
    mPrev = sum;
    return sum;
  }
}

