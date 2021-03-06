package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011319 Decimal expansion of <code>20th</code> root of 12.
 * @author Sean A. Irvine
 */
public class A011319 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(20).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
