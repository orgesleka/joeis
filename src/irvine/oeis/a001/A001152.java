package irvine.oeis.a001;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001152 Number of <code>n-input 3-output</code> switching networks with <code>GL(n,2)</code> acting on the input and <code>S(3)</code> and <code>C(2,3)</code> acting on the output.
 * @author Sean A. Irvine
 */
public class A001152 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ans.apply(3)
      .add(ans.apply(0, 3).multiply(13))
      .add(ans.apply(1, 1, 3).multiply(8))
      .add(ans.apply(2, 3).multiply(6))
      .add(ans.apply(0, 0, 0, 3).multiply(12))
      .add(ans.apply(0, 1, 0, 1, 0, 3).multiply(8))
      .divide(48).toZ();
  }
}
