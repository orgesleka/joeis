package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291142 <code>a(n) = (1/4)*A291024(n)</code>.
 * @author Sean A. Irvine
 */
public class A291142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291142() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 1, 2, 6});
  }
}
