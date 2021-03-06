package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004220 <code>10*log_10 (n)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004220 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(10.0 * Math.log10(++mN)));
  }
}
