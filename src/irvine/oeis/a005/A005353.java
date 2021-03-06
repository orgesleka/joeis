package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a020.A020478;

/**
 * A005353 Number of <code>2 X 2</code> matrices with entries <code>mod n</code> and nonzero determinant.
 * @author Sean A. Irvine
 */
public class A005353 extends A020478 {

  @Override
  public Z next() {
    final Z a = super.next();
    return Z.valueOf(mN).pow(4).subtract(a);
  }
}
