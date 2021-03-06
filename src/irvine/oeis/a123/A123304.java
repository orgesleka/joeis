package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123304 Number of edge covers for the circular ladder <code>(n-prism</code> graph) <code>C_n X K_2</code>.
 * @author Sean A. Irvine
 */
public class A123304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123304() {
    super(new long[] {-2, 1, 9, 5}, new long[] {4, 5, 43, 263});
  }
}
