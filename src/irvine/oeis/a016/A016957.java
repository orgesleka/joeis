package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016957 <code>a(n) = 6*n + 4</code>.
 * @author Sean A. Irvine
 */
public class A016957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016957() {
    super(new long[] {-1, 2}, new long[] {4, 10});
  }
}
