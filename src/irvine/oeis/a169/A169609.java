package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169609 Period <code>3</code>: repeat <code>[1, 3, 3]</code>.
 * @author Sean A. Irvine
 */
public class A169609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169609() {
    super(new long[] {1, 0, 0}, new long[] {1, 3, 3});
  }
}
