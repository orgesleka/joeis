package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011557 Powers of <code>10: a(n) = 10^n</code>.
 * @author Sean A. Irvine
 */
public class A011557 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA;
  }
}
