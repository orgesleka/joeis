package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011211 Decimal expansion of <code>17th</code> root of 5.
 * @author Sean A. Irvine
 */
public class A011211 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(17).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
