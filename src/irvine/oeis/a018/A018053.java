package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018053 Powers of fourth root of 3 rounded up.
 * @author Sean A. Irvine
 */
public class A018053 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mN.root(4).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

