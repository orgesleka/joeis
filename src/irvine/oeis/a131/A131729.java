package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131729 Period <code>4</code>: repeat <code>[0, 1, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131729() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, -1, 1});
  }
}
