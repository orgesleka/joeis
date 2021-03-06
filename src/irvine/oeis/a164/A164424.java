package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164424 Number of binary strings of length n with no substrings equal to <code>0000 0010</code> or 1101.
 * @author Sean A. Irvine
 */
public class A164424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164424() {
    super(new long[] {-1, 0, 1, 0, -1, 2}, new long[] {13, 21, 33, 51, 78, 118});
  }
}
