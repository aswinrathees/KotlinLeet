/**
 An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.
**/


object AnagramL242 {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        for (i in s.indices) {
            val index = t.indexOf(s[i])
            if (index == -1) return false
        }
        return true
    }
}

fun main() {
    print("Is Anagram: ${AnagramL242.isAnagram("anagram", "nagaram")}")
}