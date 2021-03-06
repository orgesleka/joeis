package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153814 <code>a(n) = 1001*n</code>.
 * @author Sean A. Irvine
 */
public class A153814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153814() {
    super(new long[] {-1, 2}, new long[] {1001, 2002});
  }
}
