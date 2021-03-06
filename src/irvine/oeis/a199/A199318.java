package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199318 <code>3*6^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199318() {
    super(new long[] {-6, 7}, new long[] {4, 19});
  }
}
