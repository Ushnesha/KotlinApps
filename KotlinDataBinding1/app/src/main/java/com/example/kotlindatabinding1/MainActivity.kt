package com.example.kotlindatabinding1

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.kotlindatabinding1.databinding.ActivityMainBinding
import com.example.kotlindatabinding1.uiModels.viewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this, R.layout.activity_main)

        var vm=viewModel("Ushnesha", "Daripa")
        binding.viewmodel= vm
        binding.executePendingBindings()

        Handler(Looper.getMainLooper()).postDelayed({vm.fName="Priya"
        binding.viewmodel = vm
        binding.executePendingBindings()}, 2000)
    }
}
