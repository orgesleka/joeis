package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A003669 <code>a(n)</code> is smallest number which is uniquely <code>a(j) + a(k), j &lt</code>; k.
 * @author Sean A. Irvine
 */
public class A003669 extends A002858 {

  @Override
  protected Z a1() {
    return Z.THREE;
  }

  @Override
  protected Z a2() {
    return Z.FOUR;
  }
}
