package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281647 Solutions x to the negative Pell equation <code>x^2 - 10*y^2 = -6</code> with <code>x &gt; y &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A281647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281647() {
    super(new long[] {-1, 0, 38, 0}, new long[] {2, 22, 98, 838});
  }
}
