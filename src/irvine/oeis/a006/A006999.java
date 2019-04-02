package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006999 Partitioning integers to avoid arithmetic progressions of length 3.
 * @author Sean A. Irvine
 */
public class A006999 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply(3).add(2).divide2();
    return mA;
  }
}
