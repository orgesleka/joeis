package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253709 Integer squares <code>c^2</code> that are equal to the sums of M <code>(A253707)</code> consecutive cubed integers equaling a squared integer, <code>b^3 + (b+1)^3 +</code> ... <code>+ (b+M-1)^3 = c^2</code>, for a first term <code>b(n)</code> being an odd squared integer <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253709() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {104329, 56205009, 3319833924L, 68869504900L, 771665618025L, 5755695204609L, 32148582480784L, 144648440352144L, 550265331330225L, 1830621686635225L, 5457952678249764L, 14853496612506084L, 37420748658691489L});
  }
}
