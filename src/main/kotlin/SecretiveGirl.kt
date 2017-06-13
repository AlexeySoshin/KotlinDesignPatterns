
class SecretiveGirl private constructor(val age: Int,
                                        val name: String = "A girl has no name",
                                        val desires: String = "A girl has no desires") {

    companion object {
        fun newGirl(vararg desires : String) : SecretiveGirl {

            return SecretiveGirl(17, desires = desires.joinToString(", "))
        }

        fun newGirl(name : String) : SecretiveGirl {

            return SecretiveGirl(17, name = name)
        }
    }
}