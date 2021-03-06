package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016693 Decimal expansion of <code>log(70)</code>.
 * @author Sean A. Irvine
 */
public class A016693 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(70).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
