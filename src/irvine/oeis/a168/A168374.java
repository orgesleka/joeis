package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168374 <code>a(n) = 7 * floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168374() {
    super(new long[] {-1, 1, 1}, new long[] {0, 7, 7});
  }
}
