package irvine.oeis.a074;

/**
 * A074653 <code>1/n *</code> sum over <code>d|n</code> of <code>{mu(n/d) * (5d)! / d!^5}</code>.
 * @author Sean A. Irvine
 */
public class A074653 extends A074651 {

  @Override
  protected int scale() {
    return 5;
  }
}
