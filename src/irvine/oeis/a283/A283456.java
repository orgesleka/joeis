package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283456 Row <code>n=4</code> of <code>A144048</code>.
 * @author Sean A. Irvine
 */
public class A283456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283456() {
    super(new long[] {-24, 50, -35, 10}, new long[] {5, 13, 40, 136});
  }
}
