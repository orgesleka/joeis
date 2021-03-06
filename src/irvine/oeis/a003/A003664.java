package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003664 <code>a(n)</code> is smallest number larger than <code>a(n-1)</code> and not <code>= a(j)+a(k)</code>, j&lt;k.
 * @author Sean A. Irvine
 */
public class A003664 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN % 15;
      if (mN == 10 || r == 2 || r == 5 || r == 6 || r == 9 || r == 13) {
        return Z.valueOf(mN);
      }
    }
  }
}
