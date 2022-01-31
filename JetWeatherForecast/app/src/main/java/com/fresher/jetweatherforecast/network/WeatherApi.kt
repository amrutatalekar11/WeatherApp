package com.fresher.jetweatherforecast.network

import com.fresher.jetweatherforecast.model.Weather
import com.fresher.jetweatherforecast.model.WeatherObject
import com.fresher.jetweatherforecast.utils.Constants
import com.fresher.jetweatherforecast.utils.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET(
        value = "data/2.5/forecast/daily")
    suspend fun getWeather(
        @Query("q") query: String,
        @Query("units") units: String = "imperial",
        @Query("appid") appid: String = Constants.API_KEY
    ): Weather


}