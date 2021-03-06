package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002555 Denominators of coefficients for numerical differentiation.
 * @author Sean A. Irvine
 */
public class A002555 extends A002554 {

  @Override
  public Z next() {
    return step().den().abs();
  }
}
