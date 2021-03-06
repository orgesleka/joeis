package irvine.oeis.a007;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007570 <code>a(n) = F(F(n))</code>, where F is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A007570 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(Fibonacci.fibonacci(++mN).intValueExact());
  }
}
