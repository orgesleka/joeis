package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133925 Number of compositions of n into parts of size 2 and 3 with no three consecutive <code>2s</code> and no two consecutive <code>3s</code>.
 * @author Sean A. Irvine
 */
public class A133925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133925() {
    super(new long[] {1, 1, 1, 0, -1}, new long[] {0, 1, 1, 1, 2});
  }
}
