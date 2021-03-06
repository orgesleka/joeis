package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206525 <code>a(n) = 113*(n-1) - a(n-1)</code> with <code>n&gt;1, a(1)=51</code>.
 * @author Sean A. Irvine
 */
public class A206525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206525() {
    super(new long[] {-1, 1, 1}, new long[] {51, 62, 164});
  }
}
