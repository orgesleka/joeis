package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005009 <code>7*2^n</code>.
 * @author Sean A. Irvine
 */
public class A005009 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply2();
    return mA;
  }

}

