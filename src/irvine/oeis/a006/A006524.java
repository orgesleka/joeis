package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006524 Egyptian fraction for 1/ Pi.
 * @author Sean A. Irvine
 */
public class A006524 implements Sequence {

  private CR mX = null;

  @Override
  public Z next() {
    mX = mX == null ? CR.PI.inverse() : mX.subtract(CR.valueOf(mX.inverse().ceil()).inverse());
    return mX.inverse().ceil();
  }
}
