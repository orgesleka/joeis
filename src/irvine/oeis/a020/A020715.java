package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020715 <code>n+6</code>.
 * @author Sean A. Irvine
 */
public class A020715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020715() {
    super(new long[] {-1, 2}, new long[] {6, 7});
  }
}
