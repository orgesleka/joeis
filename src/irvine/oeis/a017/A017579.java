package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017579 <code>(12n+4)^11</code>.
 * @author Sean A. Irvine
 */
public class A017579 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

