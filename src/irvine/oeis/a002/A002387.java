package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;

/**
 * A002387 Least k such that <code>H(k) &gt</code>; n, where <code>H(k)</code> is the harmonic number <code>Sum_{i=1..k} 1/i</code>.
 * @author Sean A. Irvine
 */
public class A002387 implements Sequence {

  // There is a conjectured formula that is much faster than this exact calculation

  private Q mHarmonicSum = Q.ZERO;
  private Q mN = Q.NEG_ONE;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mHarmonicSum.compareTo(mN) <= 0) {
      mK = mK.add(1);
      mHarmonicSum = mHarmonicSum.add(new Q(Z.ONE, mK));
    }
    return mK;
  }
}

