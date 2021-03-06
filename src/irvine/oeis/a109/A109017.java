package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109017 <code>a(n) =</code> Kronecker symbol <code>(-6/n)</code>.
 * @author Sean A. Irvine
 */
public class A109017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109017() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 1, 0, 1});
  }
}
