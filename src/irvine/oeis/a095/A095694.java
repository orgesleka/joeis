package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095694 <code>T(n,3)</code> diagonal of triangle in <code>A095693</code>.
 * @author Sean A. Irvine
 */
public class A095694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095694() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 22, 130, 485, 1400, 3416, 7392});
  }
}
