package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004496 Tersum <code>n + 7</code>.
 * @author Sean A. Irvine
 */
public class A004496 extends A004489 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, Z.SEVEN);
  }
}

