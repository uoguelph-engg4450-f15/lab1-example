package plan.dom;

import java.util.*;

/** An employee of the company. */
public class Employee {
    /** Creates a new employee with the indicated name.
     *  Package access as all creation should be done via Company.
     *  @param name the (unique) name f the employee
     */
    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
}
