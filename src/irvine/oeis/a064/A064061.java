package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064061 Eighth column of Catalan triangle <code>A009766</code>.
 * @author Sean A. Irvine
 */
public class A064061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064061() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {429, 1430, 3432, 7072, 13260, 23256, 38760, 62016});
  }
}
