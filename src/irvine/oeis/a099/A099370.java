package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099370 Chebyshev's polynomial of the first kind, <code>T(n,x)</code>, evaluated at <code>x=33</code>.
 * @author Sean A. Irvine
 */
public class A099370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099370() {
    super(new long[] {-1, 66}, new long[] {1, 33});
  }
}
