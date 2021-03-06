package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017616 <code>(12n+7)^12</code>.
 * @author Sean A. Irvine
 */
public class A017616 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

