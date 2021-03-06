package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155663 <code>9^n+8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155663() {
    super(new long[] {72, -89, 18}, new long[] {1, 16, 144});
  }
}
