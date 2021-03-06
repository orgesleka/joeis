package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004610 Expansion of <code>sqrt(6)</code> in base 3.
 * @author Sean A. Irvine
 */
public class A004610 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004610() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
