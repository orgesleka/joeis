package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005843 The nonnegative even numbers: <code>a(n) = 2n</code>.
 * @author Sean A. Irvine
 */
public class A005843 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN;
  }
}
