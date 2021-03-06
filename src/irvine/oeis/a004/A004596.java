package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004596 Expansion of e in base 5.
 * @author Sean A. Irvine
 */
public class A004596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004596() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
