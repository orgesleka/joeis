package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061866 <code>a(n)</code> is the number of solutions to <code>x+y+z = 0 mod 3</code>, where <code>1 &lt;= x &lt; y &lt; z &lt;=</code> n.
 * @author Sean A. Irvine
 */
public class A061866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061866() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 0, 1, 2, 4});
  }
}
