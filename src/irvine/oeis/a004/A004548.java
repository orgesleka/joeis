package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004548 Expansion of <code>sqrt(3)</code> in base 3.
 * @author Sean A. Irvine
 */
public class A004548 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004548() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
