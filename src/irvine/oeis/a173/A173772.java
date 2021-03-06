package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173772 <code>(4*10^n + 23)/9</code>.
 * @author Sean A. Irvine
 */
public class A173772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173772() {
    super(new long[] {-10, 11}, new long[] {7, 47});
  }
}
