package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000554 Number of labeled trees of diameter 3 with n nodes.
 * @author Sean A. Irvine
 */
public class A000554 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(mN - 2, 2).multiply(mN).multiply(mN - 1);
  }
}
