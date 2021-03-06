package irvine.oeis.a240;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A240545 Least k <code>&gt; 0</code> such that <code>n + p(k)</code> is prime, where <code>p(k)</code> is the number of partitions of k.
 * @author Sean A. Irvine
 */
public class A240545 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (IntegerPartition.partitions(++k).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
