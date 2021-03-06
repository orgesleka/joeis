package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245477 Period <code>6</code>: repeat <code>[1, 1, 1, 1, 1, 2]</code>.
 * @author Sean A. Irvine
 */
public class A245477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245477() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
