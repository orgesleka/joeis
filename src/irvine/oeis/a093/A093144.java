package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093144 Third binomial transform of <code>Pell(3n)/Pell(3)</code>.
 * @author Sean A. Irvine
 */
public class A093144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093144() {
    super(new long[] {-50, 20}, new long[] {0, 1});
  }
}
