package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005511 <code>a(n) = 1 + a(floor(n/2))*a(ceiling(n/2))</code>.
 * @author Sean A. Irvine
 */
public class A005511 extends A005510 {

  @Override
  protected Z start() {
    return Z.FOUR;
  }
}
