package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014237 <code>(n-th</code> prime) <code>- (n-th</code> nonprime).
 * @author Sean A. Irvine
 */
public class A014237 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (mFast.isPrime(++mN)) {
      // do nothing
    }
    return super.next().subtract(mN);
  }
}
