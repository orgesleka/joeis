package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A001950 Upper Wythoff sequence <code>(a</code> Beatty <code>sequence): a(n) = floor(n*phi^2)</code>, where phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A001950 extends A000201 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
