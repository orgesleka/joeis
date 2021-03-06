package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000559 Generalized Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A000559 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Stirling.secondKind(mN, k).multiply(Stirling.secondKind(k, 3)));
    }
    return s;
  }
}
