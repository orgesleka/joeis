package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007973 Number of permutations that are <code>n-2</code> "block reversals" away from <code>12...n</code>.
 * @author Sean A. Irvine
 */
public class A007973 extends A007975 {

  @Override
  protected int start() {
    return 1;
  }

  @Override
  public Z next() {
    init();
    for (int k = 0; k < mN - 2; ++k) {
      step();
    }
    return Z.valueOf(mPrev.size());
  }
}
