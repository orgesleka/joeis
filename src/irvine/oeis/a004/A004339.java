package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004339 Binomial coefficient <code>C(4n,n-9)</code>.
 * @author Sean A. Irvine
 */
public class A004339 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 9);
  }
}

