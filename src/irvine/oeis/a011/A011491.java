package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011491 Decimal expansion of 72nd root of 72.
 * @author Sean A. Irvine
 */
public class A011491 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(72);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
