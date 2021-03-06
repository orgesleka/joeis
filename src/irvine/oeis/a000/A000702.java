package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000702 <code>a(n) =</code> number of conjugacy classes in the alternating group <code>A_n</code>.
 * @author Sean A. Irvine
 */
public class A000702 extends A000700 {

  private final A000041 mA41 = new A000041();

  {
    super.next();
    super.next();
    mA41.next();
    mA41.next();
  }

  @Override
  public Z next() {
    return mA41.next().add(super.next().multiply(3)).divide(2);
  }
}

