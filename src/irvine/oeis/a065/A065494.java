package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065494 Number of (binary) bit strings in which no even length block of <code>0</code>'s is followed by an even length block of <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A065494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065494() {
    super(new long[] {-1, 2, 3, 0}, new long[] {1, 2, 4, 8});
  }
}
