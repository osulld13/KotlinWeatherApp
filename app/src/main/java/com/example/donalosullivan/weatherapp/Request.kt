package com.example.donalosullivan.weatherapp

import timber.log.Timber
import java.net.URL

/**
 * @author donalosullivan
 * @since 27/10/2016
 */

class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Timber.d(forecastJsonStr)
    }

}