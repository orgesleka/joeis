package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269226 Period <code>6</code>: repeat <code>[3, 9, 6, 6, 9, 3]</code>.
 * @author Sean A. Irvine
 */
public class A269226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269226() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {3, 9, 6, 6, 9});
  }
}
