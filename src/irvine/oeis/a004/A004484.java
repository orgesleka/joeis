package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004484 Sprague-Grundy values for game of Wyt Queens.
 * @author Sean A. Irvine
 */
public class A004484 extends A004481 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return wytQueens(mN, Z.THREE);
  }
}

