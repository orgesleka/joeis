package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052944 <code>a(n) = 2^n + n - 1</code>.
 * @author Sean A. Irvine
 */
public class A052944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052944() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 5});
  }
}
