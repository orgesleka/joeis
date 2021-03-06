package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004640 Cubes written in base <code>11</code>. (Next term contains a <code>non-decimal</code> character).
 * @author Sean A. Irvine
 */
public class A004640 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.pow(3).toString(11));
  }
}

