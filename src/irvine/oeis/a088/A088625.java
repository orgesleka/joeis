package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088625 <code>14*C(n,8)</code>.
 * @author Sean A. Irvine
 */
public class A088625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088625() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 14});
  }
}
