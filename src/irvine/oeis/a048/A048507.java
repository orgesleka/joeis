package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048507 <code>a(n) = T(2,n)</code>, array T given by <code>A048505</code>.
 * @author Sean A. Irvine
 */
public class A048507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048507() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 10, 35, 101});
  }
}
