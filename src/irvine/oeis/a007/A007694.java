package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007694 Numbers n such that <code>phi(n)</code> divides n.
 * @author Sean A. Irvine
 */
public class A007694 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % LongUtils.phi(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
