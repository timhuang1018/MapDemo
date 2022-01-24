package com.timhuang.demodemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.timhuang.demodemo.di.DependencyProvider
import com.timhuang.demodemo.ui.viewmodels.PlaceDetailViewModel

/**
 * @author huanghanting on 2022/1/21
 *
 */

class PlaceDetailActivity: AppCompatActivity() {


    val viewModel: PlaceDetailViewModel by lazy {
        DependencyProvider.getPlaceDetailViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()
    }

    private fun setListener() {
        //bind bookmarker icon to addOrdelete

    }

}