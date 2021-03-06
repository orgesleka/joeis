package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096230 Period <code>5</code>: repeat <code>[9, 7, 5, 3, 1]</code>.
 * @author Sean A. Irvine
 */
public class A096230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096230() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {9, 7, 5, 3, 1});
  }
}
