package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011438 Decimal expansion of <code>19th</code> root of 20.
 * @author Sean A. Irvine
 */
public class A011438 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(19).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
