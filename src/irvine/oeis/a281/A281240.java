package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281240 Solutions y to the negative Pell equation <code>y^2 = 72*x^2 - 83232</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281240() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {0, 144, 480, 816, 1344, 3024});
  }
}
