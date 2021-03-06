package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101374 <code>a(n) = n*(n^3 - n + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A101374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101374() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 8, 39, 124});
  }
}
