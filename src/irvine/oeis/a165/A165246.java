package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165246 <code>a(n) = (10^n + 53)/9</code>.
 * @author Sean A. Irvine
 */
public class A165246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165246() {
    super(new long[] {-10, 11}, new long[] {7, 17});
  }
}
