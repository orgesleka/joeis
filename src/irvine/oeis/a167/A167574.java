package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167574 The fourth row of the <code>ED3</code> array <code>A167572</code>.
 * @author Sean A. Irvine
 */
public class A167574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167574() {
    super(new long[] {-1, 4, -6, 4}, new long[] {167, 741, 2043, 4409});
  }
}
