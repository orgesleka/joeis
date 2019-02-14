package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018811.
 * @author Sean A. Irvine
 */
public class A018811 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 4) {
      return Z.TEN;
    }
    return get(mN, 5).subtract(get(mN, 4).multiply2()).add(get(mN, 3)).divide2();
  }
}