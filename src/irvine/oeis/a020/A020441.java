package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020441 Period of continued fraction for <code>sqrt(n)</code> contains exactly five <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A020441 extends A013648 {

  @Override
  protected int targetOnes() {
    return 5;
  }
}
