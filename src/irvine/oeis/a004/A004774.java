package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004774 Numbers n whose binary expansion does not end in 001.
 * @author Sean A. Irvine
 */
public class A004774 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 7) == 1 && mN != 1);
    return Z.valueOf(mN);
  }
}

