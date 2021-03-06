package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163271 Numerators of fractions in a <code>'zero-transform'</code> approximation of <code>sqrt(2)</code> by means of <code>a(n) = (a(n-1) + c)/(a(n-1) + 1)</code> with <code>c=2</code> and <code>a(1)=0</code>.
 * @author Sean A. Irvine
 */
public class A163271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163271() {
    super(new long[] {1, 2}, new long[] {0, 2});
  }
}
