package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047324 Numbers that are congruent to <code>{0, 2, 5, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047324() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 5, 6, 7});
  }
}
