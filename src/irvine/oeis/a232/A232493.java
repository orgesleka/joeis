package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232493 If <code>n mod 2 = 0</code> then <code>2^n*3^(n-1)+2^(n+1)*3^(n/2-1)</code> otherwise <code>2^n*3^(n-1)+2^n*3^((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A232493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232493() {
    super(new long[] {-72, 12, 6}, new long[] {1, 4, 20});
  }
}
