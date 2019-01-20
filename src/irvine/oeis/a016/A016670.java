package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016670.
 * @author Sean A. Irvine
 */
public class A016670 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(47).log();

  @Override
  protected CR getCR() {
    return N;
  }
}