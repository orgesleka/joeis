package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008548 Quintuple factorial numbers: <code>product[ k=0..n-1 ] (5*k+1)</code>.
 * @author Sean A. Irvine
 */
public class A008548 implements Sequence {

  private long mN = -9;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 5;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
