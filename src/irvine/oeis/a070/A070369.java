package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070369 <code>a(n) = 5^n mod 14</code>.
 * @author Sean A. Irvine
 */
public class A070369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070369() {
    super(new long[] {1, -2, 2}, new long[] {1, 5, 11});
  }
}
