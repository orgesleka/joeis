package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011381 Decimal expansion of 7th root of 17.
 * @author Sean A. Irvine
 */
public class A011381 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(7).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
