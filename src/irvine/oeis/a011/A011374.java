package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011374 Decimal expansion of <code>15th</code> root of 16.
 * @author Sean A. Irvine
 */
public class A011374 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(15).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
