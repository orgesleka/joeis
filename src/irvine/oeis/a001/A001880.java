package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001880 Coefficients of Bessel polynomials <code>y_n (x)</code>.
 * @author Sean A. Irvine
 */
public class A001880 extends A001497 {

  private int mN = 3;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
