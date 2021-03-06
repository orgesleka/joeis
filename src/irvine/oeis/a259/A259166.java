package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259166 Positive heptagonal numbers <code>(A000566)</code> that are hexagonal numbers <code>(A000384)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A259166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259166() {
    super(new long[] {1, -2079363, 2079363}, new long[] {189, 393298308, 817809556618215L});
  }
}
