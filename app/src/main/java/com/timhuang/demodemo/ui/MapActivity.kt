package com.timhuang.demodemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timhuang.demodemo.R
import com.timhuang.demodemo.di.DependencyProvider
import com.timhuang.demodemo.ui.adapters.CardItemsAdapter
import com.timhuang.demodemo.ui.viewmodels.MapViewModel
import com.timhuang.demodemo.utils.LocationClient

//2.get all item and show on map
//3.display item on card and can be scrolled
//4.filter icon can choose  to show certain type
//5. able to favorite item
//6.able to click and go detail page from card

class MapActivity : AppCompatActivity() {

    private val locationClient : LocationClient by lazy {
        DependencyProvider.getLocationClient()
    }
    private val viewModel: MapViewModel by lazy {
        DependencyProvider.getMapViewModel()
    }

    private val adapter: CardItemsAdapter by lazy {
        DependencyProvider.getCardItemsAdapter(locationClient, viewModel)
    }

    //put markers on map using manager
    private val manager: GoogleMapManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getData()
        bindData()
        setlistenter //icon onclick
    }

    private fun bindData() {
        viewModel.places.observe(this){
            manager.addClusterItems(it) //add markers
            adapter.setData(it)
        }
    }


}

//go to detail page
sealed class EventType{

}