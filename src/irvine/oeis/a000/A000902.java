package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000902 E.g.f.: <code>(1/2)*(exp(2x + x^2) + 1)</code>.
 * @author Sean A. Irvine
 */
public class A000902 implements Sequence {

  private long mN = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 2;
      return Z.ONE;
    }
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.THREE;
    } else {
      mN += 2;
      final Z t = mB.multiply2().add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

