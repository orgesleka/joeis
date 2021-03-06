package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174510 Continued fraction expansion for <code>exp( Sum_{n&gt;=1} 1/(n*A080040(n)) )</code>, where <code>A080040(n) = (1+sqrt(3))^n + (1-sqrt(3))^n</code>.
 * @author Sean A. Irvine
 */
public class A174510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174510() {
    super(new long[] {1, 0, 0, -5, 0, 0, 5, 0, 0}, new long[] {1, 1, 3, 1, 9, 13, 1, 37, 51});
  }
}
