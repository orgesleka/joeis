package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057364 <code>a(n) = floor(8*n/21)</code>.
 * @author Sean A. Irvine
 */
public class A057364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057364() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8});
  }
}
