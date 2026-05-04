package com.stela.desktopreaderv2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val tagEpc: String,
    val description: String,
    val quantity: Int

)
