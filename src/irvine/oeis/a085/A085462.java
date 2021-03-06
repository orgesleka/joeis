package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085462 Number of <code>5-tuples (v1,v2,v3,v4,v5)</code> of nonnegative integers less than n such that <code>v1&lt;=v4, v1&lt;=v5, v2&lt;=v4</code> and <code>v3&lt;=v4</code>.
 * @author Sean A. Irvine
 */
public class A085462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085462() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 77, 273, 748, 1729});
  }
}
