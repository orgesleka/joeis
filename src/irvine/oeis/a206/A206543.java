package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206543 Period <code>10</code>: repeat <code>1, 3, 5, 7, 9, 9, 7, 5, 3, 1</code>.
 * @author Sean A. Irvine
 */
public class A206543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206543() {
    super(new long[] {1, -2, 2, -2, 2}, new long[] {1, 3, 5, 7, 9});
  }
}
