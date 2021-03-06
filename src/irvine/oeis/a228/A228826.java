package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228826 Delayed continued fraction of <code>sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A228826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228826() {
    super(new long[] {-1, 0}, new long[] {2, -1});
  }
}
