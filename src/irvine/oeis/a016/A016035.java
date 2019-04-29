package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016035 <code>a(n) =</code> Sum_{j|n, <code>1 &lt; j &lt; n}</code> phi(j). Also <code>a(n) = n -</code> phi(n) <code>- 1</code> for <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A016035 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(mN - LongUtils.phi(mN) - 1);
  }
}
