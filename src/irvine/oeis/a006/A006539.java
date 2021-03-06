package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006539 Numerators of worst case for Engel expansion.
 * @author Sean A. Irvine
 */
public class A006539 extends A006540 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMinB.get(mN));
  }

}
