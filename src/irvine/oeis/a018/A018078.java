package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018078 Powers of fourth root of 12 rounded down.
 * @author Sean A. Irvine
 */
public class A018078 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(12);
    return mN.root(4);
  }
}

