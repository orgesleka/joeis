package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A025490 In base <code>11, a(n) =</code> sum of digits of <code>Fib(a(n))</code>.
 * @author Sean A. Irvine
 */
public class A025490 extends A000045 {

  private static final Z ELEVEN = Z.valueOf(11);
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next(), ELEVEN) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
