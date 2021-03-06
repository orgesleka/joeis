package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087426 <code>a(n) = S(n,4)</code> where <code>S(n,m) = sum(k=0,n,binomial(n,k)*Fibonacci(m*k))</code>.
 * @author Sean A. Irvine
 */
public class A087426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087426() {
    super(new long[] {-9, 9}, new long[] {0, 3});
  }
}
