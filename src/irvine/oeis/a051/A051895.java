package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051895 Partial sums of second pentagonal numbers with even index <code>(A049453)</code>.
 * @author Sean A. Irvine
 */
public class A051895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051895() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 33, 90});
  }
}
