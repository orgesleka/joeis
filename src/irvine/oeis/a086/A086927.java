package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086927 <code>a(n) = 10*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A086927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086927() {
    super(new long[] {1, 10}, new long[] {2, 10});
  }
}
