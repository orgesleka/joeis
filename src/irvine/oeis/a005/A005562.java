package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005562 Number of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A005562 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Binomial.binomial(mN + 5, (mN + 1) / 2).multiply(Binomial.binomial(mN + 4, mN / 2))
      .subtract(Binomial.binomial(mN + 5, mN / 2).multiply(Binomial.binomial(mN + 4, (mN - 1) / 2)));
  }
}

