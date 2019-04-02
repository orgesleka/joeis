package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018099 Powers of fourth root of 19 rounded down.
 * @author Sean A. Irvine
 */
public class A018099 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(19);
    return mN.root(4);
  }
}

