package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133125 <code>A133080 * A000244</code>.
 * @author Sean A. Irvine
 */
public class A133125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133125() {
    super(new long[] {9, 0}, new long[] {1, 4});
  }
}
