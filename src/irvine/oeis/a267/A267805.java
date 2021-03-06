package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267805 Decimal representation of the n-th iteration of the "Rule <code>214"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267805() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 7, 23, 103});
  }
}
