package plan.dom;

import java.util.*;

/** A list of features */
public interface FeatureList {
    /** Get an Iterator over the features.
     *  @return the requested Iterator
     */
    public Iterator featureIterator();

    /** Returns the number of features broken out by priority.
     *  @param p if null, all features, else only features of the given priority
     *  @return the count of the specified features
     */
    public int numFeatures(Priority p);

    /** Returns the total sizing of features broken out by priority.
     *  @param p if null, all features, else only features of the given priority
     *  @return the total of the sizings of the specified features
     */
    public double totalSizingOfFeatures(Priority p);

    /** Returns a descriptive label asosciated with this feature list
     *  (Used for reporting purposes).
     *  @return the descriptive (short) label
     */
    public String getLabel();
}
