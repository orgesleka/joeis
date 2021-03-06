package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017591 <code>(12n+5)^11</code>.
 * @author Sean A. Irvine
 */
public class A017591 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

