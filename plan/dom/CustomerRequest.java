package plan.dom;

/** The request of a customer for a feature. */
public class CustomerRequest {
    /** Create a customer request from customer "c" for feature "f" with desirability "d".
     *  @param f the feature being requested
     *  @param c the customer requesting the feature
     *  @param desirability the level of desire of the customer for the feature. Must be between 1 and 10 inclusive.
     */
    public CustomerRequest(Feature f, Customer c, int desirability) {
        if (desirability < 1 || desirability > 10)
            throw new Error("Assertion failure: desitability outside of range 1..10");
        f.addCustomerRequest(this);
        customer = c;
        this.desirability = desirability;
    }

    public int getDesirability() {
        return desirability;
    }

    public Customer getCustomer() {
        return customer;
    }

    private int desirability;
    private Customer customer;
}
