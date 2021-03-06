package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033550 <code>A005248(n)-n</code>.
 * @author Sean A. Irvine
 */
public class A033550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033550() {
    super(new long[] {-1, 5, -8, 5}, new long[] {2, 2, 5, 15});
  }
}
