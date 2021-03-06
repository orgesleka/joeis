package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194197 Number of partitions of <code>60n</code> into parts <code>&lt;= 6</code>.
 * @author Sean A. Irvine
 */
public class A194197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194197() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 19858, 436140, 2897747, 11402579, 33377536});
  }
}
