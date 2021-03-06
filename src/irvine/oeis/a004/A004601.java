package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004601 Expansion of <code>Pi</code> in base <code>2 (or</code>, binary expansion of Pi).
 * @author Sean A. Irvine
 */
public class A004601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004601() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
