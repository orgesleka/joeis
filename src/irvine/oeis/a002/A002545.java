package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Stirling;
import irvine.math.q.Q;

/**
 * A002545 Numerator of <code>Sum_{i+j+k=n</code>; i,j,k <code>&gt; 0} 1/(i*j*k)</code>.
 * @author Sean A. Irvine
 */
public class A002545 implements Sequence {

  private long mN = -1;
  private Z mF = Z.TWO;

  protected Q step() {
    ++mN;
    mF = mF.multiply(mN + 3);
    return new Q(Stirling.firstKind(mN + 3, 3).multiply(6), mF).abs();
  }

  @Override
  public Z next() {
    return step().num();
  }
}
