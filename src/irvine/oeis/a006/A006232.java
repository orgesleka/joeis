package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006232 Numerators of Cauchy numbers of first type.
 * @author Sean A. Irvine
 */
public class A006232 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Stirling.firstKind(mN, k), Z.valueOf(k + 1)));
    }
    return sum.num();
  }
}
