package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a092.A092606;

/**
 * A003156 A self-generating sequence.
 * @author Sean A. Irvine
 */
public class A003156 extends A092606 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
