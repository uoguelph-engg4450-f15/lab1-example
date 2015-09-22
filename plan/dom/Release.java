package plan.dom;

import java.util.*;

/** Represents a possible release of a software product. */
public class Release extends DefaultFeatureListImplementation implements FeatureList {
    /**
     * Removes features from this release that appear in the other release.
     *  @param other the release containing features to be removed
     */
    public void subtract(Release other) {
        super.subtract(other);
    }

    public String getDesignator(){
            return designator;
    }

    public void setDesignator(String designator){
            this.designator = designator;
    }

    /** The FeatureList label is the same as the release designator. */
    public String getLabel() {
        return designator;
    }

    private String designator;
}
