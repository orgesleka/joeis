package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106521 Numbers <code>a(n)</code> such that <code>Sum[k=0..10, (a(n)+k)^2 ]</code> is square.
 * @author Sean A. Irvine
 */
public class A106521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106521() {
    super(new long[] {1, -1, -20, 20, 1}, new long[] {18, 38, 456, 854, 9192});
  }
}
