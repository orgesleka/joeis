package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212703 Main transitions in systems of n particles with spin 4.
 * @author Sean A. Irvine
 */
public class A212703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212703() {
    super(new long[] {-81, 18}, new long[] {8, 144});
  }
}
