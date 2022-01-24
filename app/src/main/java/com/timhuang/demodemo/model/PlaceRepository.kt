package com.timhuang.demodemo.model

import com.timhuang.demodemo.model.remote.ApiInstance
import com.timhuang.demodemo.model.remote.Place
import com.timhuang.demodemo.model.remote.PlaceDetail
import com.timhuang.demodemo.model.remote.PlaceRequest
import com.timhuang.demodemo.utils.LocationClient

/**
 * @author huanghanting on 2022/1/21
 *
 */

class PlaceRepository(
    private val locationClient: LocationClient,
    private val instance:ApiInstance) {

    suspend fun getPlaces(request: PlaceRequest): Result<List<Place>>{
        return try {
            Result.success(instance.getPlaces(request))
        }catch (e:Exception){
            Result.failure(e)
        }
    }

    suspend fun getPlace(): Result<PlaceDetail>{
        return try {
            Result.success(instance.getPlace())
        }catch (e:Exception){
            Result.failure(e)
        }
    }

    suspend fun addBookmark():Result<Unit>{
        return try {
            Result.success(instance.addBookmark())
        }catch (e:Exception){
            Result.failure(e)
        }
    }

    suspend fun deleteBookmark():Result<Unit>{
        return try {
            Result.success(instance.deleteBookmark())
        }catch (e:Exception){
            Result.failure(e)
        }
    }

    fun addOrGoneBookmark(placeId: String) {
        //check book
    }
}