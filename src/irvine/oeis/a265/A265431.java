package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265431 Total number of OFF (white) cells after n iterations of the "Rule <code>188"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265431() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 4, 7, 12, 18});
  }
}
