package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094629 Numbers n with sum of <code>digits(n) = 2</code>.
 * @author Sean A. Irvine
 */
public class A094629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094629() {
    super(new long[] {10, 0}, new long[] {2, 11});
  }
}
