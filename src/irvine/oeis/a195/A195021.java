package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195021 <code>a(n) = n*(14*n - 11)</code>.
 * @author Sean A. Irvine
 */
public class A195021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195021() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 34});
  }
}
