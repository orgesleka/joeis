package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020533 <code>a(n) = 7th</code> Fibonacci polynomial evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020533() {
    super(new long[] {-4096, 5440, -1428, 85}, new long[] {13, 169, 5473, 283009});
  }
}
