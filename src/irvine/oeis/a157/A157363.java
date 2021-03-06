package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157363 <code>686n - 14</code>.
 * @author Sean A. Irvine
 */
public class A157363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157363() {
    super(new long[] {-1, 2}, new long[] {672, 1358});
  }
}
