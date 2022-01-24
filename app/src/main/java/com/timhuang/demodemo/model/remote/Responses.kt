package com.timhuang.demodemo.model.remote

import android.location.Location

/**
 * @author huanghanting on 2022/1/21
 *
 */
open class PlaceBase{

}
data class Place (
    val id:String,
    val name:String?,
    val category:ItemCategory,
    val description: String?,
    val location: Location,
    val bookmark: Boolean
    ): PlaceBase()

//Place for UI

data class PlaceDetail(
    val id:String,
)

enum class ItemCategory(val value:String){
    Restaurant("RESTAURANT"),View("VIEW"), Hotel("HOTEL")
}