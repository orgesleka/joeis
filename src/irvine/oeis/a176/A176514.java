package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176514 Period <code>6</code>: repeat <code>[3, 1, 1, 3, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A176514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176514() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {3, 1, 1, 3, 2, 1});
  }
}
