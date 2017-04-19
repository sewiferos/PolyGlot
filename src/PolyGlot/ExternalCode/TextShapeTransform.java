/**
 * @author Stanislav Lapitsky
 * @version 1.0
 */
package PolyGlot.ExternalCode;

import java.awt.geom.AffineTransform;
import javax.swing.text.View;

public interface TextShapeTransform {
    public AffineTransform getTransform(View gv, AffineTransform original);
}
