package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128922 Numbers simultaneously 10-gonal and centered <code>10-gonal</code>.
 * @author Sean A. Irvine
 */
public class A128922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128922() {
    super(new long[] {1, -323, 323}, new long[] {1, 451, 145351});
  }
}
