package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A013948 Positions of <code>2</code>'s in Kolakoski sequence <code>(A000002)</code>.
 * @author Sean A. Irvine
 */
public class A013948 extends A000002 {

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
