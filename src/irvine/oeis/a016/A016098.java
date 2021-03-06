package irvine.oeis.a016;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016098 Number of crossing set partitions of <code>{1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A016098 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return BellNumbers.bell(++mN).subtract(Binomial.catalan(mN));
  }
}
