package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210982 Zero together with <code>A126264</code> and positive terms of <code>A051624</code> interleaved.
 * @author Sean A. Irvine
 */
public class A210982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210982() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 8, 12, 26});
  }
}
