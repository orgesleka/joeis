package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000278 <code>a(n) = a(n-1) + a(n-2)^2</code>.
 * @author Sean A. Irvine
 */
public class A000278 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.add(mA.square());
    mA = mB;
    mB = t;
    return t;
  }
}
