package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047350 Numbers that are congruent to <code>{1, 2, 4} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047350() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 8});
  }
}
