package irvine.oeis.a010;

/**
 * A010825 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^19</code>.
 * @author Sean A. Irvine
 */
public class A010825 extends A010816 {

  @Override
  protected int power() {
    return 19;
  }
}
