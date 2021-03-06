package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266072 Number of ON (black) cells in the n-th iteration of the "Rule <code>3"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266072() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 1, 5});
  }
}
