package com.example.myandroidlibrary


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myandroidlibrary.databinding.FragmentImageActivityBinding

/**
 * A simple [Fragment] subclass.
 */
class ImageActivityFragment : Fragment() {
    lateinit var binding: FragmentImageActivityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentImageActivityBinding.inflate(inflater,container, false)

        val intent = activity?.intent
        val joke = intent?.getStringExtra("JOKE")
        binding.libraryWelcomeTextView.text = joke
        return binding.root
        //return inflater.inflate(R.layout.fragment_image_activity, container, false)
    }


}
