package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017303 <code>a(n) = (10*n + 2)^11</code>.
 * @author Sean A. Irvine
 */
public class A017303 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

