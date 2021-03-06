package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253209 <code>a(n) = 6^n + 5</code>.
 * @author Sean A. Irvine
 */
public class A253209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253209() {
    super(new long[] {-6, 7}, new long[] {6, 11});
  }
}
