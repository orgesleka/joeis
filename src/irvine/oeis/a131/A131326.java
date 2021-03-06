package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131326 Row sums of <code>A131325</code>.
 * @author Sean A. Irvine
 */
public class A131326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131326() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 3, 4, 9});
  }
}
