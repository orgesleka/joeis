package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266849 Binary representation of the n-th iteration of the "Rule <code>71"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266849() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 110, 100, 1111011, 10000, 11111101111L});
  }
}
