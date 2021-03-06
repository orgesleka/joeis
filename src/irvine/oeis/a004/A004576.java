package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004576 Expansion of <code>sqrt(7)</code> in base 9.
 * @author Sean A. Irvine
 */
public class A004576 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).sqrt();

  /** Construct the sequence. */
  public A004576() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
