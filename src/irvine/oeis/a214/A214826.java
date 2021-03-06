package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214826 <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code>, with <code>a(0) = 1, a(1) = a(2) = 4</code>.
 * @author Sean A. Irvine
 */
public class A214826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214826() {
    super(new long[] {1, 1, 1}, new long[] {1, 4, 4});
  }
}
