package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266301 Binary representation of the n-th iteration of the "Rule <code>15"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266301() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 110, 1, 1111110});
  }
}
