package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165207 Period <code>4</code>: repeat <code>[2, 2, 4, 4]</code>.
 * @author Sean A. Irvine
 */
public class A165207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165207() {
    super(new long[] {1, -1, 1}, new long[] {2, 2, 4});
  }
}
