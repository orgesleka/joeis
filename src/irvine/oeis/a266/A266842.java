package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266842 Decimal representation of the n-th iteration of the "Rule <code>69"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266842() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 2, 20, 43, 336, 687});
  }
}
