package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168276 <code>a(n) = 2*n - (-1)^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A168276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168276() {
    super(new long[] {-1, 1, 1}, new long[] {2, 2, 6});
  }
}
