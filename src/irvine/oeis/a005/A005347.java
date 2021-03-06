package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005347 First differences of <code>A005579</code>.
 * @author Sean A. Irvine
 */
public class A005347 extends A005579 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z a = super.next();
    final Z b = a.subtract(mA);
    mA = a;
    return b;
  }
}

