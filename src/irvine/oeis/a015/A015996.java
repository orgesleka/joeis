package irvine.oeis.a015;

import irvine.oeis.a016.A016006;

/**
 * A015996 <code>(tau(n^4) + 3)/4</code>, where tau <code>= A000005</code>.
 * @author Sean A. Irvine
 */
public class A015996 extends A016006 {

  @Override
  protected int power() {
    return 4;
  }
}
