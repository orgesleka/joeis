package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164443 Number of binary strings of length n with no substrings equal to <code>0000 0111</code> or 1110.
 * @author Sean A. Irvine
 */
public class A164443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164443() {
    super(new long[] {-1, -1, 0, 1, 1, 1}, new long[] {13, 22, 37, 64, 110, 190});
  }
}
