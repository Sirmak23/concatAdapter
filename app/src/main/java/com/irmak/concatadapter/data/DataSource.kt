package com.irmak.concatadapter.data

import com.irmak.concatadapter.R
import com.irmak.concatadapter.model.Photo
import com.irmak.concatadapter.model.User

object DataSource {
    fun getUser() = ArrayList<User>().apply {
        add(User(1, "Ahmet", "https://tramitador.org/img/user.png"))
        add(User(2, "Burak", "https://tramitador.org/img/user.png"))
        add(User(3, "Halil", "https://tramitador.org/img/user.png"))
        add(User(3, "Güney", "https://tramitador.org/img/user.png"))
        add(User(4, "Osman", "https://tramitador.org/img/user.png"))
        add(User(5, "Mehmet", "https://tramitador.org/img/user.png"))
        add(User(6, "Muhammet", "https://tramitador.org/img/user.png"))

    }

    fun getPhoto() = Photo(R.drawable.ic_movie)
}