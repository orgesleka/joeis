package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011448 Decimal expansion of <code>29th</code> root of 29.
 * @author Sean A. Irvine
 */
public class A011448 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(29);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
