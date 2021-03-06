package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049469 Decimal expansion of <code>sin(1)</code>.
 * @author Sean A. Irvine
 */
public class A049469 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.sin();

  @Override
  protected CR getCR() {
    return N;
  }
}
