package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266610 Decimal representation of the n-th iteration of the "Rule <code>41"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266610() {
    super(new long[] {-16, 0, 1, 0, 16, 0}, new long[] {1, 0, 5, 100, 1, 2040});
  }
}
