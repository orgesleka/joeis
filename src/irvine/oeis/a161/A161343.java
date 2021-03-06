package irvine.oeis.a161;

import irvine.math.z.Z;

/**
 * A161343 <code>a(n) = 7^A000120(n)</code>.
 * @author Sean A. Irvine
 */
public class A161343 extends A161342 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

