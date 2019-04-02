package irvine.oeis.a240;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A240924 Digital root of squares of numbers not divisible by 2, 3 or 5.
 * @author Sean A. Irvine
 */
public class A240924 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z pn = IntegerPartition.partitions(++mN);
    final int pi = pn.intValueExact();
    return IntegerPartition.partitions(pi).gcd(pn);
  }
}
