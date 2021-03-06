package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266327 Binary representation of the n-th iteration of the "Rule <code>20"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266327() {
    super(new long[] {1, 0}, new long[] {1, 11});
  }
}
