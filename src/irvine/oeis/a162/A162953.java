package irvine.oeis.a162;

import irvine.math.z.Z;

/**
 * A162953 <code>a(n) =</code> the number of divisors of <code>A162952(n)</code>.
 * @author Sean A. Irvine
 */
public class A162953 extends A162952 {

  @Override
  public Z next() {
    super.next();
    return mD;
  }
}
