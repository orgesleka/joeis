package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155606 a(n) = 8^n + 3^n - 1.
 * @author Sean A. Irvine
 */
public class A155606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155606() {
    super(new long[] {24, -35, 12}, new long[] {1, 10, 72});
  }
}
