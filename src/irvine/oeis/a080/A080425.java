package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080425 Period <code>3</code>: repeat <code>[0, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A080425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080425() {
    super(new long[] {1, 0, 0}, new long[] {0, 2, 1});
  }
}
