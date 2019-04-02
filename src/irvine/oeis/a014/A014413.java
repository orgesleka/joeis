package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014413 Triangular array formed from elements to right of middle of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014413 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = (mN + 2) / 2;
    }
    return Binomial.binomial(mN, mM);
  }
}
