package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000857 Number of <code>n-input 3-output</code> switching networks under the action of <code>S(n)</code> on the inputs and <code>S(3)</code> and complementing group <code>C(2,3)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000857 extends A000860 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
