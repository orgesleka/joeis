package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127407 Negative value of coefficient of <code>x^(n-2)</code> in the characteristic polynomial of a certain <code>n X n</code> integer circulant matrix.
 * @author Sean A. Irvine
 */
public class A127407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127407() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 15, 44, 100, 195});
  }
}
