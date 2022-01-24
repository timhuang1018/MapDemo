package com.timhuang.demodemo.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.timhuang.demodemo.model.PlaceRepository
import com.timhuang.demodemo.model.remote.Place
import com.timhuang.demodemo.model.remote.PlaceDetail
import com.timhuang.demodemo.utils.LocationClient

/**
 * @author huanghanting on 2022/1/21
 *
 */

class MapViewModel(
    private val repository: PlaceRepository){


    private val _places = MutableLiveData<List<Place>>()
    val places : LiveData<List<Place>>
    get() = _places

    private val _event = MutableLiveData<EventType>

    fun getData() {
        //launch in scope
        val result = repository.getPlaces()
        when{
            result.isSuccess ->{
                _places.value = result.getOrNull()
            }
            result.isFailure ->{

            }
        }
    }

    fun changeEventType()


}

class CardViewModel{

}

class PlaceDetailViewModel(private val repository: PlaceRepository){

    private val _place = MutableLiveData<PlaceDetail>()
    val place : LiveData<PlaceDetail>
        get() = _place

    fun getData(){
        //launch in scope
        val result = repository.getPlace()
        when{
            result.isSuccess ->{
                _place.value = result.getOrNull()
            }
            result.isFailure ->{

            }
        }
    }

    fun addOrGoneBookmark(){
        place.value?.id?.let {
            repository.addOrGoneBookmark(placeId = it)
        }
    }
}