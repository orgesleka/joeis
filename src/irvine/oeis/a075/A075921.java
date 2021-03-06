package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075921 Second column of triangle <code>A075502</code>.
 * @author Sean A. Irvine
 */
public class A075921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075921() {
    super(new long[] {-98, 21}, new long[] {1, 21});
  }
}
