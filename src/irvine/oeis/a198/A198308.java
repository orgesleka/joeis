package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198308 Moore lower bound on the order of an <code>(8,g)-cage</code>.
 * @author Sean A. Irvine
 */
public class A198308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198308() {
    super(new long[] {-7, 7, 1}, new long[] {9, 16, 65});
  }
}
