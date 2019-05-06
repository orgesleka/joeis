package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004933 Floor of <code>n*phi^18</code>, where phi is the golden ratio, <code>A001622</code>.
 * @author Sean A. Irvine
 */
public class A004933 implements Sequence {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 18);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(CR.valueOf(++mN)).floor();
  }
}
