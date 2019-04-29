package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020639 Lpf(n): least prime dividing n (when <code>n &gt; 1)</code>; <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A020639 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Cheetah.factor(mN).toZArray()[0];
  }
}
