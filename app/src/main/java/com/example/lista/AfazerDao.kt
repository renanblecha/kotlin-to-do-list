package com.example.lista

import androidx.room.*

@Dao
interface AfazerDao {

    @get:Query("SELECT * FROM Afazer")
    val all: List<Afazer>

    @Insert
    fun insert(afazer: Afazer)

    @Delete
    fun delete(afazer: Afazer)

    @Update
    fun update(afazer: Afazer)

}
