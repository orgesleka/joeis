package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a030.A030182;

/**
 * A045481 McKay-Thompson series of class <code>3B</code> for the Monster group with <code>a(0) = -3</code>.
 * @author Sean A. Irvine
 */
public class A045481 extends A030182 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 1 ? Z.valueOf(-3) : a;
  }
}
