package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000886 Number of switching networks with <code>GL(n,2)</code> acting on the domain and <code>AG(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000886 extends A000721 {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG2);
  }
}
