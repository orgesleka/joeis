package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017948 Powers of <code>sqrt(14)</code> rounded up.
 * @author Sean A. Irvine
 */
public class A017948 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    final Z[] s = mN.sqrtAndRemainder();
    return s[0].add(Z.ZERO.equals(s[1]) ? 0 : 1);
  }
}

