package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041772 Numerators of continued fraction convergents to <code>sqrt(407)</code>.
 * @author Sean A. Irvine
 */
public class A041772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041772() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 5326, 0, 0, 0, 0, 0}, new long[] {20, 101, 121, 343, 464, 2663, 106984, 537583, 644567, 1826717, 2471284, 14183137});
  }
}
