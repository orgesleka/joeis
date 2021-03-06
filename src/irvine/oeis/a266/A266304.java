package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266304 Total number of OFF (white) cells after n iterations of the "Rule <code>15"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266304() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 5, 6, 14});
  }
}
