package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010476 Decimal expansion of square root of 20.
 * @author Sean A. Irvine
 */
public class A010476 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(20);
  }
}
