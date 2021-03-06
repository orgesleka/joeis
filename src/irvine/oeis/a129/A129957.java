package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129957 <code>a(n) = n^3</code> if n is odd, <code>n^3 + 1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A129957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129957() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 1, 9, 27, 65});
  }
}
