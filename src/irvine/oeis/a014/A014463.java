package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014463 Triangular array formed from elements to left of middle of rows of Pascal's triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014463 implements Sequence {

  private long mN = 2;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= (mN + 1) / 2) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM);
  }
}
