package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074872 Inverse BinomialMean transform of the Fibonacci sequence <code>A000045</code> (with the initial <code>0</code> omitted).
 * @author Sean A. Irvine
 */
public class A074872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074872() {
    super(new long[] {5, 0}, new long[] {1, 1});
  }
}
