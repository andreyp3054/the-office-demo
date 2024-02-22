package com.backendpractice.theofficedemo.models

object Office {
    //list of employee
    private var employees: MutableSet<Employee> = mutableSetOf();

    fun hireEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun getAllEmployees(): MutableSet<Employee>{
        return this.employees
    }

}