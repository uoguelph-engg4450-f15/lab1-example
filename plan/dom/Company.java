package plan.dom;

import java.util.*;

/**
 * A software company  that builds products.
 */
public class Company {
    /** Lookup a Customer and return it or return a new one if not found.
     *  @param name the name of the customer to lookup
     *  @return a new or existing Customer associated with this Company
     */
    public Customer lookupOrCreateCustomer(String name) {
        Customer c = (Customer)lnkCustomer.get(name);
        if (c == null) {
            c = new Customer(name);
            lnkCustomer.put(c.getName(), c);
        }
        return c;
    }


    /** Lookup an Employee and return it or return a new one if not found.
     *  @param name the name of the employee to lookup
     *  @return a new or existing Employee associated with this Company
     */
    public Employee lookupOrCreateEmployee(String name) {
        Employee e = (Employee)lnkEmployee.get(name);
        if (e == null) {
            e = new Employee(name);
            lnkEmployee.put(e.getName(), e);
        }
        return e;
    }


    /** Lookup a Software product and return it or return a new one if not found.
     *  @param name the name of the software product to lookup
     *  @return a new or existing Software product associated with this Company
     */
    public Software lookupOrCreateSoftware(String name) {
        Software s = (Software)lnkSoftware.get(name);
        if (s == null) {
            s = new Software(name);
            lnkSoftware.put(s.getName(), s);
        }
        return s;
    }


    /** Returns the software product of the given name.
     *  @param name the name of the software product to lookup
     *  @return the requested software product or null of not found
     */
    public Software getSoftware(String name) {
        return (Software)lnkSoftware.get(name);
    }


    // stores the relationships for easy name lookup.
    private HashMap lnkSoftware = new HashMap();
    private HashMap lnkEmployee = new HashMap();
    private HashMap lnkCustomer = new HashMap();
}
