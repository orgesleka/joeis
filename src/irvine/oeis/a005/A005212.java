package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005212 <code>n!</code> if n is odd otherwise <code>0</code> (from the Taylor series for sin <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A005212 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.ZERO;
    }
    if (mN > 2) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return mF;
  }
}
