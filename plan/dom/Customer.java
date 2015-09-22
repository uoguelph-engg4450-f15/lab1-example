package plan.dom;

import java.util.*;

/** Represents a customer of the software company.  */
public class Customer {
    /** Create a new customer with the given name.
     *  Package access, as all customer creation should be done through Company.
     *  @param name the (unique) name of the customer
     */
    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
}
