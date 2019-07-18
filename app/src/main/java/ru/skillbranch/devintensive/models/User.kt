package ru.skillbranch.devintensive.models

import java.util.*
import ru.skillbranch.devintensive.utils.Utils

data class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
    ) {
    constructor(id: String, firstName: String?, lastName: String?) : this(id, firstName, lastName, null)
    constructor(id: String) : this(id, "Dev", "Kot")

    init {
//        println(" id : $id   firstName : $firstName   lastName : $lastName")
    }

    companion object Factory {
        private var lastId: Int = -1
        fun makeUser(fullName: String?): User {
            lastId++
            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User("$lastId", firstName = firstName, lastName = lastName)
        }
    }
}

