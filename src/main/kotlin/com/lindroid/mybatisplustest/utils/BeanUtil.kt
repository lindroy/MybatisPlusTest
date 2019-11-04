package com.lindroid.mybatisplustest.utils

import org.modelmapper.ModelMapper


inline fun <reified T : Any> Any.convert()  = ModelMapper().map(this,T::class.java)