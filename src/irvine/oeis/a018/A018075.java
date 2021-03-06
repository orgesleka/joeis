package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018075 Powers of fourth root of 11 rounded down.
 * @author Sean A. Irvine
 */
public class A018075 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN.root(4);
  }
}

