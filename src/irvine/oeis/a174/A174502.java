package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174502 Continued fraction expansion for <code>exp( Sum_{n&gt;=1} 1/(n*A086903(n)) )</code>, where <code>A086903(n) = (4+sqrt(15))^n + (4-sqrt(15))^n</code>.
 * @author Sean A. Irvine
 */
public class A174502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174502() {
    super(new long[] {1, 0, -9, 0, 9, 0}, new long[] {1, 6, 1, 60, 1, 486});
  }
}
