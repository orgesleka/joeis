package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017993 Powers of cube root of 6 rounded up.
 * @author Sean A. Irvine
 */
public class A017993 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

