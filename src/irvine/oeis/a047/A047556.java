package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047556 Numbers that are congruent to <code>{3, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047556() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 6, 7, 11});
  }
}
