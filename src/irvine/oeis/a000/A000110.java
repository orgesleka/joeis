package irvine.oeis.a000;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000110 Bell or exponential numbers: number of ways to partition a set of n labeled elements.
 * @author Sean A. Irvine
 */
public class A000110 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return BellNumbers.bell(++mN);
  }
}

