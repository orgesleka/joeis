package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020988 <code>a(n) = (2/3)*(4^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A020988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020988() {
    super(new long[] {-4, 5}, new long[] {0, 2});
  }
}
