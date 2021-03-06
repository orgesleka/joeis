package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094421 <code>n * (6n^2 + 6n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A094421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094421() {
    super(new long[] {-1, 4, -6, 4}, new long[] {13, 74, 219, 484});
  }
}
