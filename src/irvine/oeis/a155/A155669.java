package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155669 <code>10^n+9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155669() {
    super(new long[] {90, -109, 20}, new long[] {1, 18, 180});
  }
}
