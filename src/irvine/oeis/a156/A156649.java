package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156649 Decimal expansion of <code>(9+4*sqrt(2))/7</code>.
 * @author Sean A. Irvine
 */
public class A156649 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).add(CR.valueOf(32).sqrt()).divide(CR.valueOf(7));

  @Override
  protected CR getCR() {
    return N;
  }
}
