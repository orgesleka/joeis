package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014729 Squares of even Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A014729 extends A014445 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
