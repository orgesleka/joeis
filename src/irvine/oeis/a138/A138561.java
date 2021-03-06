package irvine.oeis.a138;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A138561 Start with the list <code>{1}</code>; for each <code>n &gt;= 1</code>, append <code>p(n)</code> primes followed by <code>c(n)</code> composite numbers, where <code>p(n)</code> is the n-th prime and <code>c(n)</code> is the n-th composite number.
 * @author Sean A. Irvine
 */
public class A138561 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mC = Z.ZERO;
  private Z mPP = Z.ONE;
  private Z mCC = Z.ONE;
  private boolean mComposites = true;
  private Z mCount = Z.ONE;

  private Z nextComposite(Z c) {
    do {
      c = c.add(1);
    } while (mPrime.isPrime(c));
    return c;
  }

  @Override
  public Z next() {
    if (!Z.ZERO.equals(mCount)) {
      mCount = mCount.subtract(Z.ONE);
      if (mComposites) {
        mC = nextComposite(mC);
        return mC;
      } else {
        mP = mPrime.nextPrime(mP);
        return mP;
      }
    }
    mComposites = !mComposites;
    if (mComposites) {
      mCC = nextComposite(mCC);
      mCount = mCC;
    } else {
      mPP = mPrime.nextPrime(mPP);
      mCount = mPP;
    }
    return next();
  }
}

