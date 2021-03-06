package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A006254 Numbers n such that <code>2n-1</code> is prime.
 * @author Sean A. Irvine
 */
public class A006254 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
