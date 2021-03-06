package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000923 Primes p of the form <code>3k+1</code> such that <code>sum_{x=1..p} cos(2*Pi*x^3/p) &lt; -sqrt(p)</code>.
 * @author Sean A. Irvine
 */
public class A000923 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.signum() < 0 && s.multiply(s).compareTo(p) > 0;
  }
}
