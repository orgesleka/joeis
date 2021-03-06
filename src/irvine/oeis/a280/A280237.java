package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280237 Period length 8 sequence <code>[0, 1, 0, 1, -1, 1, 0, 1, ...]</code>.
 * @author Sean A. Irvine
 */
public class A280237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280237() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, -1, 1, 0, 1});
  }
}
