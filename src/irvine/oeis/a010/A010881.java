package irvine.oeis.a010;

import irvine.math.LongUtils;
import irvine.oeis.PeriodicSequence;

/**
 * A010881 Simple periodic sequence: <code>n mod 12</code>.
 * @author Sean A. Irvine
 */
public class A010881 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010881() {
    super(LongUtils.identity(12));
  }
}

