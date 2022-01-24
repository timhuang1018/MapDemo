package com.timhuang.demodemo.model.remote

/**
 * @author huanghanting on 2022/1/21
 *
 */

interface ApiInstance {

    //GET /places
    suspend fun getPlaces(request: PlaceRequest): List<Place>

    //GET /place/{place_id}
    suspend fun getPlace(): PlaceDetail

    //POST /place/{place_id}/bookmarked
    suspend fun addBookmark():Unit
    //DELETE /place/{place_id}/bookmarked

    suspend fun deleteBookmark():Unit

}


