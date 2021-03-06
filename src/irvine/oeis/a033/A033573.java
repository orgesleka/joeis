package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033573 <code>(2n+1)(9n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033573() {
    super(new long[] {1, -3, 3}, new long[] {1, 30, 95});
  }
}
