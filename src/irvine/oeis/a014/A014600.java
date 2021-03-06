package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000003;

/**
 * A014600 Class numbers <code>h(D)</code> of imaginary quadratic fields with discriminant <code>D=0,1 mod 4, D&lt;0</code>.
 * @author Sean A. Irvine
 */
public class A014600 extends A000003 {

  // Interleave A000003 and A014599

  private long mD = 0;
  private long mDelta = 3;

  @Override
  public Z next() {
    mD -= mDelta;
    mDelta = 4 - mDelta;
    return Z.valueOf(classNumber(mD));
  }
}
