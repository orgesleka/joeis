package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016932 <code>a(n) = (6*n + 1)^12</code>.
 * @author Sean A. Irvine
 */
public class A016932 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

