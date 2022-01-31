package com.fresher.jetweatherforecast.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fresher.jetweatherforecast.model.Favorite
import com.fresher.jetweatherforecast.model.Unit

@Database(entities = [Favorite::class, Unit::class], version = 2, exportSchema = false)
abstract class WeatherDataBase: RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}