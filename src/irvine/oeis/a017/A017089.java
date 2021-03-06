package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017089 <code>a(n) = 8*n+2</code>.
 * @author Sean A. Irvine
 */
public class A017089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017089() {
    super(new long[] {-1, 2}, new long[] {2, 10});
  }
}
