package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019723 Decimal expansion of <code>sqrt(Pi)/21</code>.
 * @author Sean A. Irvine
 */
public class A019723 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(21));

  /** Construct the sequence. */
  public A019723() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
