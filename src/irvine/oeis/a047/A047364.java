package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047364 Numbers that are congruent to <code>{3, 4, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047364() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 4, 5, 10});
  }
}
