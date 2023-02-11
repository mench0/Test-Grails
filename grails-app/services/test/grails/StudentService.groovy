package test.grails

import grails.gorm.transactions.Transactional

import java.awt.print.Book

@Transactional
class StudentService {

    def get(id){
        Student.get(id)
    }

    def list() {
        Student.list()
    }

    def save(student){
        student.save()
    }

    def delete(id){
        Student.get(id).delete()
    }

//   пока не сделал
    def update(id){
        Student student = Student.get(id)
        Student.name = student.name
        Student.name = student.age
        student.save(id)
    }

}
