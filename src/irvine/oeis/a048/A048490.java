package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048490 <code>a(n)=T(7,n)</code>, array T given by <code>A048483</code>.
 * @author Sean A. Irvine
 */
public class A048490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048490() {
    super(new long[] {-2, 3}, new long[] {1, 9});
  }
}
