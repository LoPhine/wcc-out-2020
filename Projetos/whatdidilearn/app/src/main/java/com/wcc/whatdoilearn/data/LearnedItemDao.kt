package com.wcc.whatdoilearn.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.wcc.whatdoilearn.entities.LearnedItem

@Dao
interface LearnedItemDao {
    @Query("SELECT * FROM learned_item ORDER BY item_title ASC")
    fun getAll(): List<LearnedItem>

    @Insert
    fun insert(item: LearnedItem)
}