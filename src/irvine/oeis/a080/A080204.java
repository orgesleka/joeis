package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080204 Number of fixed points under n-fold inflation for the substitution rule <code>a-&gt;abc, b-&gt;ab, c-&gt;b</code> that underlies the Kolakoski <code>(3,1)</code> sequence, compare <code>math.MG/0206098</code>.
 * @author Sean A. Irvine
 */
public class A080204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080204() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 10, 23});
  }
}
