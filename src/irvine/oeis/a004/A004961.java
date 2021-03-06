package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004961 Ceiling of <code>n*phi^6</code>, where phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A004961 implements Sequence {

  private static final CR PHI = ComputableReals.SINGLETON.pow(CR.PHI, 6);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI.multiply(CR.valueOf(++mN)).ceil();
  }
}
