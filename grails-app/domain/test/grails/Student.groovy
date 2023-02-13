package test.grails

class Student {

    String firstName
    String lastname

    static hasMany = [tasks: Task]

}
