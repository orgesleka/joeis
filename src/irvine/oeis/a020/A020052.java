package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020052 Integer part of <code>Gamma(n + 8/11)/Gamma(8/11)</code>.
 * @author Sean A. Irvine
 */
public class A020052 implements Sequence {

  private static final Q C = new Q(8, 11);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.floor();
  }
}
