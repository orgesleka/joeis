package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011364 Decimal expansion of <code>20th</code> root of 15.
 * @author Sean A. Irvine
 */
public class A011364 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(20).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
