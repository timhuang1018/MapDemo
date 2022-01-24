package com.timhuang.demodemo.model.remote

import android.location.Location

/**
 * @author huanghanting on 2022/1/21
 *
 */

data class PlaceRequest(val location: Location, val category: ItemCategory?=null)