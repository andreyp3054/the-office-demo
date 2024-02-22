package com.backendpractice.theofficedemo.models

import kotlin.reflect.jvm.internal.impl.incremental.components.Position

class Employee(var id: Int, var fullName: String, var email: String, var position: String) {

override fun toString():String{
    return "$id\n $fullName\n $email\n $position\n"

}
}