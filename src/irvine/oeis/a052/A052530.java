package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052530 <code>a(n) = 4*a(n-1) - a(n-2)</code>, with <code>a(0) = 0, a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A052530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052530() {
    super(new long[] {-1, 4}, new long[] {0, 2});
  }
}
