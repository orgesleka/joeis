package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021614 Expansion of <code>1/((1-x)(1-3x)(1-7x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021614() {
    super(new long[] {-231, 362, -152, 22}, new long[] {1, 22, 332, 4322});
  }
}
