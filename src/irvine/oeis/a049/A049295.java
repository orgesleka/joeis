package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049295 Number of subgroups of index 4 in free group of rank <code>n+1</code>.
 * @author Sean A. Irvine
 */
public class A049295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049295() {
    super(new long[] {1152, -2256, 1436, -368, 37}, new long[] {1, 71, 2143, 54335, 1321471});
  }
}
