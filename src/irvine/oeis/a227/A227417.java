package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227417 Integer triples <code>a(3n-2) =</code> n, <code>a(3n-1) = n+4</code>, and <code>a(3n) = n+7</code>.
 * @author Sean A. Irvine
 */
public class A227417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227417() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 8, 2});
  }
}
