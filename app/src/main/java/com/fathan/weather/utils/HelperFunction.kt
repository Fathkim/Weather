package com.fathan.weather.utils

import java.math.RoundingMode

object HelperFunction {

    fun formatterDegree(temp: Double?) : String{
        val temperature = temp as Double
        val tempToCelsius = temperature - (273.0)
        val formatDegree = tempToCelsius.toBigDecimal().setScale(2, RoundingMode.CEILING)
        return "$formatDegree °C"
    }
}