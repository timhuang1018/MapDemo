package com.timhuang.demodemo.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timhuang.demodemo.model.remote.Place
import com.timhuang.demodemo.ui.viewmodels.MapViewModel
import com.timhuang.demodemo.utils.LocationClient

/**
 * @author huanghanting on 2022/1/21
 * u
 */

class CardItemsAdapter(
    private val viewModel: MapViewModel
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //inflate the card item layout
        //return CardItemViewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //bind to view holder

    }

    override fun getItemCount(): Int {
    }

    fun setData(it: List<Place>) {

    }

}
//use interface to pass viewmodel for handling action
class CardItemViewHolder(){
    fun onBind(){

        //addOrGoneBookmark()
        //changeEventType if on click
    }
}