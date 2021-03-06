package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005358 Number of low discrepancy sequences in base 5.
 * @author Sean A. Irvine
 */
public class A005358 extends A005356 {

  @Override
  protected Z power(final int d) {
    return Z.FIVE.pow(d);
  }
}
