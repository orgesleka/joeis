package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094091 <code>a(1) = 0</code>; for <code>n&gt;0, a(n) =</code> smaller of 0 and 1 such that we avoid the property that, for some i and j in the range S <code>= 2 &lt;= i &lt; j &lt;= n/2, a(i)</code> ... <code>a(2i)</code> is a subsequence of <code>a(j)</code> ... <code>a(2j)</code>.
 * @author Georg Fischer
 */
public class A094091 extends FiniteSequence {

  /** Construct the sequence. */
  public A094091() {
    super(0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0);
  }
}
