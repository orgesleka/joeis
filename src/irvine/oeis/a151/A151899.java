package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151899 Period <code>6</code>: repeat <code>[0, 0, 1, 1, 1, 2]</code>.
 * @author Sean A. Irvine
 */
public class A151899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151899() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 0, 1, 1, 1, 2});
  }
}
