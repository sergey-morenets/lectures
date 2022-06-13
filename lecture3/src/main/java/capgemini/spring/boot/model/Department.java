package capgemini.spring.boot.model;

import lombok.Getter;
import lombok.Setter;

@Getter

@Setter
/**
 * This is department in the company that has at least one manager and employees
 */
public class Department {

    private int id;

    private String name;

    /*** Adds new employee to the existing department.
     *
     * @param id
     * @param name Required employee name
     */
    public void addEmployee(int id, String name) {

    }
}
