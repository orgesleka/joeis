package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170955 <code>a(n) = 10^n - 9</code>.
 * @author Sean A. Irvine
 */
public class A170955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170955() {
    super(new long[] {-10, 11}, new long[] {1, 91});
  }
}
