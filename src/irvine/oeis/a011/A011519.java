package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011519 Decimal expansion of <code>100th</code> root of 100.
 * @author Sean A. Irvine
 */
public class A011519 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(100);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
