package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079326 <code>a(n) =</code> the largest number m such that if m monominoes are removed from an <code>n X n</code> square then an L-triomino must remain.
 * @author Sean A. Irvine
 */
public class A079326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079326() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 7, 9, 17});
  }
}
