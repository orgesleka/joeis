package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A071758 Successive minima of partial sum of harmonic series Sum <code>(mu(n)/n)</code> are approximately <code>1/ a(n)</code>.
 * @author Sean A. Irvine
 */
public class A071758 implements Sequence {

  private Q mBest = Q.ONE;
  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(new Q(Mobius.mobius(++mN), mN));
      if (mSum.abs().compareTo(mBest.abs()) < 0) {
        mBest = mSum;
        return mSum.reciprocal().floor();
      }
    }
  }
}
