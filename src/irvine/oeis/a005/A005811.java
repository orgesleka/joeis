package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005811 Number of runs in binary expansion of <code>n (n&gt;0)</code>; number of <code>1</code>'s in Gray code for n.
 * @author Sean A. Irvine
 */
public class A005811 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long r = 1;
    long m = mN >>> 1;
    long c = mN & 1;
    while (m != 0) {
      if ((m & 1) != c) {
        ++r;
        c = 1 - c;
      }
      m >>>= 1;
    }
    return Z.valueOf(r);
  }
}
