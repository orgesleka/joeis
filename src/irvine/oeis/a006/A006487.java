package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006487 Denominators of greedy Egyptian fraction for square root of 2.
 * @author Sean A. Irvine
 */
public class A006487 implements Sequence {

  private Q mRecipSum = Q.ZERO;

  @Override
  public Z next() {
    final CR v = CR.SQRT2.subtract(CR.valueOf(mRecipSum));
    final Z a = v.inverse().ceil();
    mRecipSum = mRecipSum.add(new Q(Z.ONE, a));
    return a;
  }
}

