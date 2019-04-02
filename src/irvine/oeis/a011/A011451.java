package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011451 Decimal expansion of 32nd root of 32.
 * @author Sean A. Irvine
 */
public class A011451 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(32);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
