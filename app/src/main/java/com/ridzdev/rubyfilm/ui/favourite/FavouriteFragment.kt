package com.ridzdev.rubyfilm.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ridzdev.rubyfilm.databinding.FragmentFavouriteBinding

class FavouriteFragment : Fragment() {

    private var _binding: FragmentFavouriteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val favouriteViewModel =
            ViewModelProvider(this).get(FavouriteViewModel::class.java)

        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)

        val recyclerView = _binding!!.fragmentFavouriteRecyclerview
        val favouriteAdapter = FavouriteRecyclerViewAdapter()
        recyclerView.adapter = favouriteAdapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}