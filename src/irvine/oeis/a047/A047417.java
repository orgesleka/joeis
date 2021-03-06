package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047417 Numbers that are congruent to <code>{2, 3, 4, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047417() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 6, 10});
  }
}
