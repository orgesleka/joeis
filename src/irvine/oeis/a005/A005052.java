package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005052 <code>10*3^n</code>.
 * @author Sean A. Irvine
 */
public class A005052 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(3);
    return mA;
  }
}

