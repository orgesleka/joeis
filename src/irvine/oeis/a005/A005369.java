package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005369 <code>a(n) = 1</code> if n is of form <code>m(m+1)</code>, else 0.
 * @author Sean A. Irvine
 */
public class A005369 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(1).sqrtAndRemainder()[1].equals(Z.ZERO) ? Z.ONE : Z.ZERO;
  }
}
