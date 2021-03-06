package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002287 Bisection of <code>A002470</code>.
 * @author Sean A. Irvine
 */
public class A002287 extends A002470 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
