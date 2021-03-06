package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087960 <code>a(n) = (-1)^binomial(n+1,2)</code>.
 * @author Sean A. Irvine
 */
public class A087960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087960() {
    super(new long[] {-1, 0}, new long[] {1, -1});
  }
}
