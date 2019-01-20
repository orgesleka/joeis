package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016631.
 * @author Sean A. Irvine
 */
public class A016631 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).log();

  @Override
  protected CR getCR() {
    return N;
  }
}