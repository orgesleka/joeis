package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003951 G.f.: <code>(1+x)/(1-8*x)</code>.
 * @author Sean A. Irvine
 */
public class A003951 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.NINE;
    } else {
      mA = mA.shiftLeft(3);
    }
    return mA;
  }
}
