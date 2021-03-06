package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001515 Bessel polynomial <code>y_n(x)</code> evaluated at <code>x=1</code>.
 * @author Sean A. Irvine
 */
public class A001515 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.ONE;
  private long mN = -3;

  @Override
  public Z next() {
    mN += 2;
    final Z t = mB.multiply(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
