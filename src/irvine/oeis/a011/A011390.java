package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011390 Decimal expansion of <code>16th</code> root of 17.
 * @author Sean A. Irvine
 */
public class A011390 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(16).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
