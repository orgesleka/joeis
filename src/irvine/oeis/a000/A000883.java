package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000883 Number of switching networks with <code>C(2,n)</code> actiong on the domain and <code>AG(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000883 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int tn = 1 << mN;
    return Z.ONE.shiftLeft(2 * tn)
      .subtract(Z.FOUR.shiftLeft(tn))
      .add(Z.EIGHT.shiftLeft(mN))
      .add(Z.TEN.shiftLeft(mN + tn))
      .shiftRight(mN)
      .divide(24);
  }
}
