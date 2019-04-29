package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020799.
 * @author Sean A. Irvine
 */
public class A020799 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(42).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
