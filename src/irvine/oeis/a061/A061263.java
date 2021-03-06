package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061263 <code>a(n) = floor(n^3/9)</code>.
 * @author Sean A. Irvine
 */
public class A061263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061263() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 0, 3, 7, 13});
  }
}
