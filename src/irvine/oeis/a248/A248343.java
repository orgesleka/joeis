package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248343 <code>10^n - 8^n</code>.
 * @author Sean A. Irvine
 */
public class A248343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248343() {
    super(new long[] {-80, 18}, new long[] {0, 2});
  }
}
