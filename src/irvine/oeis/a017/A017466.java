package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017466 <code>(11*n+6)^6</code>.
 * @author Sean A. Irvine
 */
public class A017466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017466() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 24137569, 481890304, 3518743761L, 15625000000L, 51520374361L, 139314069504L});
  }
}
