package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253208 <code>a(n) = 4^n + 3</code>.
 * @author Sean A. Irvine
 */
public class A253208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253208() {
    super(new long[] {-4, 5}, new long[] {4, 7});
  }
}
