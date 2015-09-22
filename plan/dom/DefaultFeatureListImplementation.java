package plan.dom;

import java.util.*;

/** Default implementation of FeatureList minus the getLabel() method */
abstract class DefaultFeatureListImplementation implements FeatureList {

    /** Get an Iterator over the features.
     *  @return the requested Iterator
     */
    public Iterator featureIterator() {
        return features.iterator();
    }


    /** Add the indicated feature to the list.
     *  @param f the feature to add
     */
    public void addFeature(Feature f) {
        features.add(f);
    }


    /** Sort features according to the order given by the Feature Comparator.
     *  @param comapre a Comparator for features. 
     */
    protected void sortFeatures(Comparator compare) {
        Collections.sort(features,compare);
    }


    /** Remove all features in the other list from this one.]
     *  @param other the feature list to substract from this one
     */
    protected void subtract(DefaultFeatureListImplementation other) {
        this.features.removeAll(other.features);
    }


    /** Returns the number of features broken out by priority.
     *  @param p if null, all features, else only features of the given priority
     *  @return the count of the specified features
     */
    public int numFeatures(Priority p) {
        int n = 0;
        for (Iterator i = features.iterator(); i.hasNext(); ) {
            Feature f = (Feature)i.next();
            if( p==null || f.getPriority().equals(p) )
                n++;
        }
        return n;
    }


    /** Returns the total sizing of features broken out by priority.
     *  @param p if null, all features, else only features of the given priority
     *  @return the total of the sizings of the specified features
     */
    public double totalSizingOfFeatures(Priority p) {
        double s = 0.0;
        for (Iterator i = features.iterator(); i.hasNext(); ) {
            Feature f = (Feature)i.next();
            if( p==null || f.getPriority().equals(p))
                s += f.getSizing();
        }
        return s;
    }

    private Vector features = new Vector();
}
