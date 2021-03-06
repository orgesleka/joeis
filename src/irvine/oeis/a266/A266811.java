package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266811 Total number of ON (black) cells after n iterations of the "Rule <code>62"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266811() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 4, 7, 13, 18, 26, 35, 45});
  }
}
