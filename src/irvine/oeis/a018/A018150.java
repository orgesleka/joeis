package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018150 Powers of fifth root of 13 rounded down.
 * @author Sean A. Irvine
 */
public class A018150 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(13);
    return mN.root(5);
  }
}

