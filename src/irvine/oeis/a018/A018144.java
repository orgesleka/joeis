package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018144 Powers of fifth root of 11 rounded down.
 * @author Sean A. Irvine
 */
public class A018144 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN.root(5);
  }
}

