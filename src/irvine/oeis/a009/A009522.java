package irvine.oeis.a009;

/**
 * A009522 "Pascal sweep" for <code>k=8</code>: draw a horizontal line through the 1 at <code>C(k,0)</code> in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A009522 extends A009475 {

  @Override
  protected long row() {
    return 8;
  }
}
