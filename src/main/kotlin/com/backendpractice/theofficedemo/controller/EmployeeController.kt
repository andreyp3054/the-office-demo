package com.backendpractice.theofficedemo.controller

import com.backendpractice.theofficedemo.models.Employee
import com.backendpractice.theofficedemo.models.Office
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("employee")
class EmployeeController {

    @PostMapping("hire")
    fun hireEmployee(@RequestBody employee: Employee): String {
//        return "You are hired! $employee"
        return if (Office.hireEmployee(employee))
            "The following person has been hired: $employee"
        else "This person could not be hired: $employee"
    }

    //how to hire? follow this format in Body Request thru hireEmployee
    /*
        {
            "id": 5,
            "fullName":  "Gwapos",
            "email": "jeremiah@gmail.com",
            "position": "Engineering Head"
        }
     */
    @GetMapping("all")
    fun allEmployees(): MutableSet<Employee> {
        return Office.getAllEmployees()
//        return listOf(
//                Employee(2, "Jeremiah Dumpor", "jeremiah@gmail.com", "Engineering Head"),
//                Employee(3, "Terence Acebu", email = "terenceacebu@gmail.com", "Senior Web Developer"),
//                Employee(4, "Trisha", "trisha@gmail.com", "CEO")
//        )
    }

    @GetMapping("test")
    fun test(): String {
        return Employee(1, "Mark Andrey Acebu", "mark@gmail.com", "Manager").toString()
    }

    @GetMapping("fire/{id}")
    fun fireEmployee(@PathVariable id: Int): String {
        return if (Office.fireEmployee(id))
            "This person with id $id has been fired"
        else "The person with id $id has NOT been fired"
    }
}
