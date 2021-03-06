package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036545 <code>a(n) = T(4,n)</code>, array T given by <code>A048471</code>.
 * @author Sean A. Irvine
 */
public class A036545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036545() {
    super(new long[] {-3, 4}, new long[] {1, 17});
  }
}
