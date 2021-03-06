package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102283 Period <code>3</code>: repeat <code>[0, 1, -1]</code>.
 * @author Sean A. Irvine
 */
public class A102283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102283() {
    super(new long[] {-1, -1}, new long[] {0, 1});
  }
}
