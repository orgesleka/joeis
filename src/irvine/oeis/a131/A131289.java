package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131289 Period <code>12</code>: repeat <code>1, 1, 3, -3, -3, 1, -1, -1, -3, 3, 3, -1</code>.
 * @author Sean A. Irvine
 */
public class A131289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131289() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, -3, -3, 1});
  }
}
