package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199212 <code>a(n) = 2*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199212() {
    super(new long[] {-5, 6}, new long[] {3, 11});
  }
}
