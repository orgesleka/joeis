package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011510 Decimal expansion of 91st root of 91.
 * @author Sean A. Irvine
 */
public class A011510 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(91);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
