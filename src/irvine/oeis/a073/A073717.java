package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073717 <code>a(n)=T(2n+1)</code>, where <code>T(n)</code> are the tribonacci numbers <code>A000073</code>.
 * @author Sean A. Irvine
 */
public class A073717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073717() {
    super(new long[] {1, 1, 3}, new long[] {0, 1, 4});
  }
}
