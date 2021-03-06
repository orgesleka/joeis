package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A003438 Number of <code>5 X 5</code> matrices with nonnegative integer entries and row and column sums equal to n.
 * @author Sean A. Irvine
 */
public class A003438 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A003438() {
    super(Polynomial.create(1, 103, 4306, 63110, 388615, 1115068, 1575669, 1115068, 388615, 63110, 4306, 103, 1),
      RING.pow(RING.oneMinusXToTheN(1), 17));
  }
}

