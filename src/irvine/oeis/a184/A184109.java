package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184109 <code>n + ceiling(n^2/9)</code>; complement of <code>A184108</code>.
 * @author Sean A. Irvine
 */
public class A184109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184109() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {2, 3, 4, 6, 8, 10, 13, 16, 18, 22, 25});
  }
}
