package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187497 Let i be in <code>{1,2,3,4}</code> and <code>r&gt;=0</code> an integer. Let p <code>={p_1,p_2,p_3,p_4} = {-3,0,1,2}, n=3*r+p_i</code> and define <code>a(-3)=0</code>. Then <code>a(n)=a(3*r+p_i)</code> gives the number of <code>H_(9,3,0)</code> tiles in a subdivided <code>H_(9,i,r)</code> tile after linear scaling by the factor <code>Q^r</code>, where <code>Q=sqrt(2*cos(Pi/9))</code>.
 * @author Sean A. Irvine
 */
public class A187497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187497() {
    super(new long[] {1, 0, 0, 3, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, 0, 1, 0, 2, 1});
  }
}
