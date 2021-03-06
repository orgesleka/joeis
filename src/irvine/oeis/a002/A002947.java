package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.polynomial.Polynomial;

/**
 * A002947 Continued fraction for cube root of 4.
 * @author Sean A. Irvine
 */
public class A002947 extends A002945 {

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-4, 0, 0, 1);
  }
}
