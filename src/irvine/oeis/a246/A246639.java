package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246639 Sequence <code>a(n) = 3 + 5*A001519(n+1)</code> appearing in a certain three circle touching problem, together with <code>A246638</code>.
 * @author Sean A. Irvine
 */
public class A246639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246639() {
    super(new long[] {1, -4, 4}, new long[] {8, 13, 28});
  }
}
