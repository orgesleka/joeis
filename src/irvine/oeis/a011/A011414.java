package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011414 Decimal expansion of <code>10th</code> root of 19.
 * @author Sean A. Irvine
 */
public class A011414 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(10).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
