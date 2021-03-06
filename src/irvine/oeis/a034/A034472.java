package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034472 <code>a(n) = 3^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A034472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034472() {
    super(new long[] {-3, 4}, new long[] {2, 4});
  }
}
