package irvine.oeis.a006;

/**
 * A006407 Number of unsensed 2-connected planar maps.
 * @author Sean A. Irvine
 */
public class A006407 extends A006395 {

  {
    next();
    next();
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
