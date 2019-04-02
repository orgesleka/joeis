package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276644 A self-composition of the repunits: A(x) = G(G(x)), where G(x) = g.f. of A002275.
 * @author Sean A. Irvine
 */
public class A276644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276644() {
    super(new long[] {-100, 330, -272, 33}, new long[] {0, 1, 22, 464});
  }
}
