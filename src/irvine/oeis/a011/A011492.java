package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011492 Decimal expansion of 73rd root of 73.
 * @author Sean A. Irvine
 */
public class A011492 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(73);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
