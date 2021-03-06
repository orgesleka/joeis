package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153819 Linear recurrence with <code>a(n) = 3a(n-1) - a(n-2) + 2 = 4a(n-1) - 4a(n-2) + a(n-3)</code>. Full sequence for <code>A153466</code>.
 * @author Sean A. Irvine
 */
public class A153819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153819() {
    super(new long[] {1, -4, 4}, new long[] {16, 34, 88});
  }
}
