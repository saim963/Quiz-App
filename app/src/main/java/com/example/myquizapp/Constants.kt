package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Ethiopia",
            "Sri Lanka","Finland",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Sudan","Afghanistan",
            "Australia","United States",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "Belgium","Russia",
            "Canada","Chile",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Thailand","Brazil",
            "Tanzania","Madagascar",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Hungary","Iceland",
            "France","Denmark",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Ireland",
            "San Marino","Malta",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Serbia","Bahamas",
            "Germany","Costa Rica",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "Cuba","Peru",
            "India","Nepal",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Abu Dhabi","Kuwait",
            "Syria","Palestine",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "Nauru","Marshall Islands",
            "Vietnam","New Zealand",
            4
        )
        questionList.add(que10)

        return questionList

    }
}