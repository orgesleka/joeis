package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017507 <code>(11n+9)^11</code>.
 * @author Sean A. Irvine
 */
public class A017507 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

