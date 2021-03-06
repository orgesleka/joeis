package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000505 Eulerian numbers <code>(Euler</code>'s triangle: column <code>k=5</code> of <code>A008292</code>, column <code>k=4</code> of <code>A173018)</code>.
 * @author Sean A. Irvine
 */
public class A000505 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final long n23 = (mN + 2L) * (mN + 3L) / 2;
    final long n123 = n23 * (mN + 1) / 3;
    return Z.FIVE.pow(mN + 2)
      .subtract(Z.valueOf(mN + 3).shiftLeft(2 * mN + 4))
      .add(Z.THREE.pow(mN + 2).multiply(n23))
      .subtract(Z.valueOf(n123).shiftLeft(mN + 2))
      .add(n123 * mN / 4);
  }
}
