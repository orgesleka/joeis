package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185963 Row sums of number triangle <code>A185962</code>.
 * @author Sean A. Irvine
 */
public class A185963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185963() {
    super(new long[] {1, -3, 2}, new long[] {1, 0, -2});
  }
}
