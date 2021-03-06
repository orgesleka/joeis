package irvine.oeis.a003;

/**
 * A003045 <code>a(n) (n&gt;6)</code> is least integer <code>&gt; a(n-1)</code> with precisely three representations <code>a(n) = a(i) + a(j), 1&lt;=i&lt;j&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A003045 extends A003044 {

  @Override
  protected int numReps() {
    return 3;
  }
}
