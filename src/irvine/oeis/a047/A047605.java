package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047605 Numbers that are congruent to <code>{0, 2, 3, 5} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047605() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 2, 3, 5});
  }
}
