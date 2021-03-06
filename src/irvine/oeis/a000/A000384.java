package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000384 Hexagonal numbers: <code>a(n) = n*(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A000384 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().subtract(Z.ONE).multiply(mN);
  }
}
