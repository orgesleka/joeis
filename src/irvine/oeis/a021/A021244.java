package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021244 Expansion of <code>1/((1-x)(1-2x)(1-7x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021244() {
    super(new long[] {-154, 267, -133, 21}, new long[] {1, 21, 308, 3942});
  }
}
