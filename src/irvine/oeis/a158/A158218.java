package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158218 <code>169n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A158218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158218() {
    super(new long[] {1, -3, 3}, new long[] {167, 672, 1515});
  }
}
