package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018908 Define sequence <code>S(a_0,a_1)</code> by <code>a_{n+2}</code> is least integer such that <code>a_{n+2}/a_{n+1}&gt;a_{n+1}/a_n</code> for <code>n &gt;= 0</code>. This is <code>S(3,4)</code>.
 * @author Sean A. Irvine
 */
public class A018908 extends PisotSequence {

  /** Construct the sequence. */
  public A018908() {
    super(3, 4, Q.ONE);
  }
}
