package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021913 Period <code>4</code>: repeat <code>[0, 0, 1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A021913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021913() {
    super(new long[] {1, -1, 1}, new long[] {0, 0, 1});
  }
}
