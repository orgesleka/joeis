package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110781 Number of digits in <code>A110780(n)</code>.
 * @author Sean A. Irvine
 */
public class A110781 extends A110780 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

