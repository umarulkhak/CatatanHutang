package com.example.catatanhutang.Config

import androidx.room.*

@Dao
interface DaoNotes {
    @Query( value = "SELECT * FROM notes")
    fun GetAll():List<Notes>
    @Insert
    fun insert(notes:Notes)
    @Update
    fun update(notes:Notes)
    @Delete
    fun delete(notes:Notes)


}