package irvine.oeis.a165;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165713 <code>a(n) =</code> the smallest integer <code>&gt; n</code> that is divisible by exactly the same number of distinct primes as n is.
 * @author Sean A. Irvine
 */
public class A165713 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final int target = Cheetah.factor(++mN).omega();
    long v = mN;
    while (Cheetah.factor(++v).omega() != target) {
      // do nothing
    }
    return Z.valueOf(v);
  }
}

