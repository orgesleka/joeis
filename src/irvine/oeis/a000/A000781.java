package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000781 <code>a(n) = 3*Catalan(n)-Catalan(n-1)-1</code>.
 * @author Sean A. Irvine
 */
public class A000781 extends A000108 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z r = mPrev;
    mPrev = super.next();
    return mPrev.multiply(3).subtract(r).subtract(1);
  }
}
