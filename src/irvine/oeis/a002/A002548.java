package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002548 Denominators of coefficients for numerical differentiation.
 * @author Sean A. Irvine
 */
public class A002548 extends A002547 {

  @Override
  public Z next() {
    return step().den();
  }
}
