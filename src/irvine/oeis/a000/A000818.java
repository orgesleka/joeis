package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000818 Number of switching networks under action of <code>GL_n(Z_2)</code>.
 * @author Sean A. Irvine
 */
public class A000818 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return GeneralLinearCycleIndex.cycleIndex(++mN).apply(3).toZ();
  }

}

