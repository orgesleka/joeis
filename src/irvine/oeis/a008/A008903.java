package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008903 <code>x-&gt;x/2</code> if x even, <code>x-&gt;3x-1</code> if x odd.
 * @author Sean A. Irvine
 */
public class A008903 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(100) : mA.isEven() ? mA.divide2() : mA.multiply(3).subtract(1);
    return mA;
  }
}


