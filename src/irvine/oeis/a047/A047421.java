package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047421 <code>Floor(8n/7)</code>.
 * @author Sean A. Irvine
 */
public class A047421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047421() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 8});
  }
}
