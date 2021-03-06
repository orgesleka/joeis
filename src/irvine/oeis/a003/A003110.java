package irvine.oeis.a003;

/**
 * A003110 <code>a(n) =</code> number of special odd permutations of <code>2*n+1</code>.
 * @author Sean A. Irvine
 */
public class A003110 extends A003109 {

  protected boolean accept() {
    return !super.accept();
  }
}
