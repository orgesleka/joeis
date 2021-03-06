package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a005.A005282;

/**
 * A025582 A <code>B_2</code> sequence: <code>a(n) =</code> least value such that sequence increases and pairwise sums of elements are all distinct.
 * @author Sean A. Irvine
 */
public class A025582 extends A005282 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

