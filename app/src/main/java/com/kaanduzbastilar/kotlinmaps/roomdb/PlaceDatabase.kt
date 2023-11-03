package com.kaanduzbastilar.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kaanduzbastilar.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)//arrayOf yerine [Place::class]
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao() : PlaceDao
}