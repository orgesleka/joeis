package irvine.oeis.a009;

import irvine.math.z.Z;

/**
 * A009177 Numbers that are the hypotenuses of more than one Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A009177 extends A009000 {

  private boolean mChanged = false;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z a = mPrev;
      mPrev = super.next();
      if (a.equals(mPrev)) {
        if (mChanged) {
          mChanged = false;
          return a;
        }
      } else {
        mChanged = true;
      }
    }
  }
}
