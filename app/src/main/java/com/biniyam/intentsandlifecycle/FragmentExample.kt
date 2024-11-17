package com.biniyam.intentsandlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample: Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("fragment","onAttach")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_new,container,false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("fragment","onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("fragment","onCreatedView")
    }

    override fun onStart() {
        super.onStart()
        Log.i("fragment","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("fragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("fragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("fragment","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("fragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("fragment","onDetach")
    }
}