package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004695 <code>a(n) = floor(Fibonacci(n)/2)</code>.
 * @author Sean A. Irvine
 */
public class A004695 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

