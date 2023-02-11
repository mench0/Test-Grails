package test.grails

import grails.gorm.transactions.Transactional

import java.awt.print.Book

class StudentController {

    StudentService studentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        respond studentService.list()
    }

    def show(Long id) {
        respond studentService.get(id)
    }

    def create() {
        respond new Student(params)
    }

    def save(Student student) {
        studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }

    def edit(Book book) {
        respond book
    }

    @Transactional
    def update(Book book) {
        if (book == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (book.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond book.errors, view:'edit'
            return
        }

        book.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'book.label', default: 'Book'), book.id])
                redirect book
            }
            '*'{ respond book, [status: OK] }
        }
    }
}