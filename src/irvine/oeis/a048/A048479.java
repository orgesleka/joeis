package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048479 <code>a(n) = T(7,n)</code>, array T given by <code>A048472</code>.
 * @author Sean A. Irvine
 */
public class A048479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048479() {
    super(new long[] {4, -8, 5}, new long[] {1, 9, 33});
  }
}
