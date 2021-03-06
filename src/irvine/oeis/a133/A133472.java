package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133472 6 followed by numbers with <code>n-1 0</code>'s between 1 and 5.
 * @author Sean A. Irvine
 */
public class A133472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133472() {
    super(new long[] {-10, 11}, new long[] {6, 15});
  }
}
