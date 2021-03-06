package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107383 <code>a(n) = 2*a(n-2) + 2*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A107383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107383() {
    super(new long[] {2, 2, 0}, new long[] {0, 1, 1});
  }
}
