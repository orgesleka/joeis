package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083039 Number of divisors of n that are <code>&lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A083039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083039() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 2, 2, 2});
  }
}
