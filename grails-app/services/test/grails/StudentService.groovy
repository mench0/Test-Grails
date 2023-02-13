package test.grails

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

import java.awt.print.Book

@Service(Student)
interface StudentService {

    Student get(Serializable id)

    List<Student> list(Map args)

    Long count()

    void delete(Serializable id)

    Student save(Student student)

}
