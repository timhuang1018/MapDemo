package com.timhuang.demodemo.di

import com.timhuang.demodemo.model.PlaceRepository
import com.timhuang.demodemo.ui.adapters.CardItemsAdapter
import com.timhuang.demodemo.ui.viewmodels.CardViewModel
import com.timhuang.demodemo.ui.viewmodels.MapViewModel
import com.timhuang.demodemo.ui.viewmodels.PlaceDetailViewModel
import com.timhuang.demodemo.utils.LocationClient

/**
 * @author huanghanting on 2022/1/21
 *
 */

object DependencyProvider{

    fun getMapViewModel(): MapViewModel {
        return MapViewModel(getRepository())
    }

    fun getCardViewModel(): CardViewModel {
        return CardViewModel()
    }

    fun getLocationClient(): LocationClient {
        return LocationClient()
    }

    fun getCardItemsAdapter( viewModel: MapViewModel): CardItemsAdapter {
        return CardItemsAdapter( viewModel)
    }

    fun getRepository(): PlaceRepository {
        return PlaceRepository()
    }

    fun getPlaceDetailViewModel() : PlaceDetailViewModel {
        return PlaceDetailViewModel()
    }

}