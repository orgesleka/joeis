package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266090 Decimal representation of the n-th iteration of the "Rule <code>17"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266090() {
    super(new long[] {128, 0, -152, 0, 25, 0}, new long[] {1, 1, 8, 79, 64, 1663});
  }
}
