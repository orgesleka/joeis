package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198852 <code>4*8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198852() {
    super(new long[] {-8, 9}, new long[] {3, 31});
  }
}
