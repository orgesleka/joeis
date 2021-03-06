package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199485 <code>8*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199485() {
    super(new long[] {-7, 8}, new long[] {9, 57});
  }
}
