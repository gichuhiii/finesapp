package com.example.eclectics.utils

import com.example.eclectics.model.Offense

object ListUtils {

    //TODO: learn about apply,let, also, with etc function

    fun offenseList() = mutableListOf<Offense>().apply {
        add(Offense(1, "John Doe", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(2, "Jane Doe", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(3, "Nathan Ruru", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(4, "Sophia Foe", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(5, "Jeff Koinange", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(6, "Rick Sanchez", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(7, "Fah Mulan", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(8, "Kendrick Lamar", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(9, "Drake Bell", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(10, "Kanye West", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(11, "Rihanna Fenty", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(12, "Snoop Dog", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(13, "Asap Rocky", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(14, "Wiz Khalifa", "KCK 123", "Speeding", "Paid", "12/12/2020"))
        add(Offense(15, "Kevin Hart", "KCK 123", "Speeding", "Paid", "12/12/2020"))

    }

}