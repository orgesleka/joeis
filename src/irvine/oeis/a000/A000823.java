package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000823 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000823 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1 << (mN + 1)) - mN - 1).add(Z.ONE.shiftLeft(1 << mN)).subtract(Z.ONE.shiftLeft((1 << mN) - mN - 1));
  }
}

