package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013815 <code>a(n) = 21^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013815 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(9261) : mA.multiply(194481);
    return mA;
  }
}
