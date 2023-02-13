package test.grails

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Task)
    interface TaskService {

        Task get(Serializable id)

        List<Task> list(Map args)

        Long count()

        void delete(Serializable id)

        Task save(Task task)


}
