package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099235 A quadrisection of <code>1/(1-x-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A099235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099235() {
    super(new long[] {1, 4, 6, 4, 1}, new long[] {1, 1, 5, 15, 45});
  }
}
