package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014898 <code>a(1)=1, a(n) = 15*a(n-1) +</code> n.
 * @author Sean A. Irvine
 */
public class A014898 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(15).add(mN);
    }
    return mA;
  }
}
