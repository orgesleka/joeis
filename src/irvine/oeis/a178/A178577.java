package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178577 Partial sums of <code>round(5^n/9)</code>.
 * @author Sean A. Irvine
 */
public class A178577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178577() {
    super(new long[] {-5, 6, -1, -5, 6}, new long[] {0, 1, 4, 18, 87});
  }
}
