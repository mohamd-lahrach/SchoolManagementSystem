package models

class Teacher {
    var id : String? = null
    var firstName : String? = null
    var lastName : String? = null
    var email : String? = null
    var phone : String? = null
    var password : String? = null
    var teachedClasses : ArrayList<String>? = null
    var teachedCourses : ArrayList<String>? = null


    constructor(
        id: String?,
        firstName: String?,
        lastName: String?,
        email: String?,
        phone: String?,
        password: String?,
    ) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.phone = phone
        this.password = password
        this.teachedClasses = arrayListOf()
        this.teachedCourses = arrayListOf()
    }
    fun addTeachedClasses(classe : Classe){
        val nameClasse = classe.id
        this.teachedClasses!!.add(nameClasse!!)
    }
    fun addTeachedCourses(course: Course){
        val nameCourse = course.id
        this.teachedCourses!!.add(nameCourse!!)
    }
    private fun athentication(){

    }
    private fun isAthenticated(){

    }
}
