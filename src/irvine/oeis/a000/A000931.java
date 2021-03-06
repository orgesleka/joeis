package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000931 Padovan sequence (or Padovan <code>numbers): a(n) = a(n-2) + a(n-3)</code> with <code>a(0)=1, a(1)=a(2)=0</code>.
 * @author Sean A. Irvine
 */
public class A000931 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
