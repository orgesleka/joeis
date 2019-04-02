package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018177 Powers of fifth root of 22 rounded down.
 * @author Sean A. Irvine
 */
public class A018177 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(22);
    return mN.root(5);
  }
}

