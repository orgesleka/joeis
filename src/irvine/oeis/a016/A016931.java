package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016931 <code>a(n) = (6*n + 1)^11</code>.
 * @author Sean A. Irvine
 */
public class A016931 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(11);
  }
}

