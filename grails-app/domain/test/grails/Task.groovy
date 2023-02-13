package test.grails

class Task {

    String title;
    String desc;

    static belongsTo = [student:Student]

    static constraints = {
        title size: 5..100, blank: false
        desc size: 1..100, blank: false

    }

    String toString() {
        title
        desc
    }
}
