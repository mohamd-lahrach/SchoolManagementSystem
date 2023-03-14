package models

class Course {
    var id: String? = null
    var courseName: String? = null
    var duration: String? = null
    var factor: Byte? = null
    var description: String? = null

    constructor(
        _id: String,
        _courseName: String,
        _duration: String,
        _factor: Byte,
        _description: String
    ){
        this.id = _id
        this.courseName = _courseName
        this.duration = _duration
        this.factor = _factor
        this.description = _description
    }
}