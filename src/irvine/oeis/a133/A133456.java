package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133456 Period <code>18</code>: repeat <code>3, 3, -5, 0, 3, -1, -3, 0, 7</code> followed by their negatives.
 * @author Sean A. Irvine
 */
public class A133456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133456() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 3, -5, 0, 3, -1, -3, 0, 7});
  }
}
