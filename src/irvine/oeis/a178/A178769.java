package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178769 <code>a(n) = (5*10^n + 13)/9</code>.
 * @author Sean A. Irvine
 */
public class A178769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178769() {
    super(new long[] {-10, 11}, new long[] {2, 7});
  }
}
