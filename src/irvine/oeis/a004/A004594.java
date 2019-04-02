package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004594 Expansion of e in base 3.
 * @author Sean A. Irvine
 */
public class A004594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004594() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
