package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102001 A weighted tribonacci, <code>(1,2,4)</code>.
 * @author Sean A. Irvine
 */
public class A102001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102001() {
    super(new long[] {4, 2, 1}, new long[] {1, 3, 9});
  }
}
