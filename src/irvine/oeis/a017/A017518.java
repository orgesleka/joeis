package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017518 <code>(11n+10)^10</code>.
 * @author Sean A. Irvine
 */
public class A017518 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(10);
  }
}

