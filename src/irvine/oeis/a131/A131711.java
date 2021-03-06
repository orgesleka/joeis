package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131711 Period <code>12</code>: repeat <code>0, 1, 2, 5, 2, 9, 0, 9, 8, 5, 8, 1</code>.
 * @author Sean A. Irvine
 */
public class A131711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131711() {
    super(new long[] {1, 0, -1, 0, 1, 0, -1, 0, 1, 0}, new long[] {0, 1, 2, 5, 2, 9, 0, 9, 8, 5});
  }
}
