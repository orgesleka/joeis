package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A003623 Wythoff <code>AB-numbers: [[n*phi^2]*phi]</code>, where phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A003623 extends A000201 {

  private A001950 mB = new A001950();

  @Override
  public Z next() {
    return super.next().add(mB.next());
  }
}
