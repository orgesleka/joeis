package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001177 Fibonacci entry points: <code>a(n) =</code> least k <code>&gt;= 1</code> such that n divides Fibonacci number <code>F_k (=A000045(k))</code>.
 * @author Sean A. Irvine
 */
public class A001177 extends A001175 {

  private final A001176 mZeros = new A001176();

  @Override
  public Z next() {
    return super.next().divide(mZeros.next());
  }
}
