package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158677 Period <code>6</code>: repeat <code>[3, 4, 0, 5, 6, 3]</code>.
 * @author Sean A. Irvine
 */
public class A158677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158677() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {3, 4, 0, 5, 6, 3});
  }
}
