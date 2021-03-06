package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095310 <code>a(n+3) = 2*a(n+2) + 3*(n+1) - a(n)</code>.
 * @author Sean A. Irvine
 */
public class A095310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095310() {
    super(new long[] {-1, 3, 2}, new long[] {1, 5, 12});
  }
}
