package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004992 <code>3^n/n!*product[ k=0..n-1 ](3*k + 5)</code>.
 * @author Sean A. Irvine
 */
public class A004992 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN + 2).multiply(3).divide(mN);
    }
    return mA;
  }
}

