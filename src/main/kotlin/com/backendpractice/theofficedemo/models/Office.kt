package com.backendpractice.theofficedemo.models

object Office {
    //list of employee
    private var employees: MutableSet<Employee> = mutableSetOf();

    fun hireEmployee(employee: Employee): Boolean {
        return employees.add(employee)
    }

    fun getAllEmployees(): MutableSet<Employee> {
        return this.employees
    }

    fun fireEmployee(id: Int): Boolean {
        return employees.removeIf{it.id == id}
    }

}