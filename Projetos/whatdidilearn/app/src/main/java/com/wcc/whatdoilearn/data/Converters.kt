package com.wcc.whatdoilearn.data

import androidx.room.TypeConverter
import com.wcc.whatdoilearn.R
import com.wcc.whatdoilearn.entities.UnderstandingLevel
import java.util.logging.Level


class Converters {
    @TypeConverter
    fun levelToInt(level: UnderstandingLevel): Int {
        return level.color

    }
    @TypeConverter
    fun intToLevel(color: Int): UnderstandingLevel{
        return when(color){
            R.color.purple_700 -> UnderstandingLevel.LOW
            R.color.purple_500 -> UnderstandingLevel.MEDIUM
            else-> UnderstandingLevel.HIGH
        }
    }
}