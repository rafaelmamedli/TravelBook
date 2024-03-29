package com.example.travelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.travelbook.model.Place

@Database (entities = [Place::class], version = 1)
abstract class PlaceDataBase : RoomDatabase(){
    abstract fun placeDao(): PlaceDao
}