package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts : List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        if (firstName.isNullOrEmpty()) firstName = null
        var lastName = parts?.getOrNull(1)
        if (lastName.isNullOrEmpty()) lastName = null
//        return Pair(firstName, lastName) эквивалентно:
        return firstName to lastName
    }
}