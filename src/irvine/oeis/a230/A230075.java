package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230075 Period <code>8</code>: repeat <code>[2, 1, 0, 1, -2, -1, 0, -1]</code>.
 * @author Sean A. Irvine
 */
public class A230075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230075() {
    super(new long[] {-1, 0, 0, 0}, new long[] {2, 1, 0, 1});
  }
}
