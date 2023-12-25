package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,"onAttach1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"onCreate1() is Called",Toast.LENGTH_SHORT).show()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,"onCreateView1() is Called",Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context,"onStart1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context,"onResume1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context,"onPause1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,"onStop1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        Toast.makeText(context,"onDestroyView1() is Called",Toast.LENGTH_SHORT).show()
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"onDestroy1() is Called",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context,"onDetach1() is Called",Toast.LENGTH_SHORT).show()
    }
}
