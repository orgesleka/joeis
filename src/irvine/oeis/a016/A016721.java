package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016721 Decimal expansion of <code>log(98)</code>.
 * @author Sean A. Irvine
 */
public class A016721 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(98).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
