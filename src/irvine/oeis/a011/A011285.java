package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011285 Decimal expansion of <code>16th</code> root of 10.
 * @author Sean A. Irvine
 */
public class A011285 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(10), CR.valueOf(16).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
