package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004563 Expansion of <code>sqrt(6)</code> in base 4.
 * @author Sean A. Irvine
 */
public class A004563 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004563() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
