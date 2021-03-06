package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281242 Solutions y to the negative Pell equation <code>y^2 = 72*x^2 - 1331712</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281242() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {0, 576, 1920, 3264, 5376, 12096});
  }
}
