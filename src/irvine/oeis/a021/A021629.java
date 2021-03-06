package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021629 Expansion of <code>1/((1-x)(1-3x)(1-7x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021629() {
    super(new long[] {-252, 393, -163, 23}, new long[] {1, 23, 366, 5062});
  }
}
