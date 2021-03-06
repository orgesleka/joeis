package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011514 Decimal expansion of <code>95th</code> root of 95.
 * @author Sean A. Irvine
 */
public class A011514 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(95);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
