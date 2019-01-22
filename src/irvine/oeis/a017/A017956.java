package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017956.
 * @author Sean A. Irvine
 */
public class A017956 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}
