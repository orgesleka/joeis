package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049677 <code>a(n) = (F(8*n+6) + F(8*n+1))/3</code>, where <code>F=A000045</code> (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049677() {
    super(new long[] {-1, 47}, new long[] {3, 137});
  }
}
