package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011442 Decimal expansion of 23rd root of 23.
 * @author Sean A. Irvine
 */
public class A011442 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(23);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
