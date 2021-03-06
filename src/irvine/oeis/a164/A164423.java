package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164423 Number of binary strings of length n with no substrings equal to <code>0000 0010</code> or 1100.
 * @author Sean A. Irvine
 */
public class A164423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164423() {
    super(new long[] {1, 1, 0, 0, 0, 1, 1}, new long[] {13, 21, 35, 59, 100, 171, 292});
  }
}
