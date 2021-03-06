package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A018249 <code>Prime(2^n)-1</code>.
 * @author Sean A. Irvine
 */
public class A018249 extends A000040 {

  private long mN = 0;
  private long mT = 1;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (++mN == mT) {
        mT *= 2;
        return p.subtract(1);
      }
    }
  }
}
