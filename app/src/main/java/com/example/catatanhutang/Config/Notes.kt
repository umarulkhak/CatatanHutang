package com.example.catatanhutang.Config

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data public class Notes(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Int?=null,
    @ColumnInfo(name = "note")
    var note:String?=null,
    @ColumnInfo(name = "date")
    var date:String?=null

)