package plan.dom;

import java.util.*;

public class Software extends DefaultFeatureListImplementation implements FeatureList {
    Software(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** Suggests a release of this software product.
     *  @param capacity the number of person-days of coding effort available to work on the release
     *  @return a Release containing a suggested list of features
     */
    public Release planRelease(double capacity) {
        double inplan = 0.0;
        sortFeatures(ReverseFeaturePlanningOrder.get());
        Release r = new Release();
        for (Iterator i = featureIterator(); i.hasNext(); ) {
            Feature f = (Feature)i.next();
            if (inplan + f.getSizing() <= capacity) {
                r.addFeature(f);
                inplan += f.getSizing();
            }
        }
        return r;
    }

    /** The FeatureList label is the name of the Software product. */
    public String getLabel() {
        return name;
    }

    private String name;
}
