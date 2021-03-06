package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018907 Define the sequence <code>S(a_0,a_1)</code> by <code>a_{n+2}</code> is the least integer such that <code>a_{n+2}/a_{n+1} &gt; a_{n+1}/a_n</code> for <code>n &gt;= 0</code>. This is <code>S(2,7)</code>.
 * @author Sean A. Irvine
 */
public class A018907 extends PisotSequence {

  /** Construct the sequence. */
  public A018907() {
    super(2, 7, Q.ONE);
  }
}
