package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128209 Jacobsthal <code>numbers(A001045) + 1</code>.
 * @author Sean A. Irvine
 */
public class A128209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128209() {
    super(new long[] {-2, 1, 2}, new long[] {1, 2, 2});
  }
}
