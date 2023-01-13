package com.ridzdev.rubyfilm.ui.subscription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ridzdev.rubyfilm.databinding.FragmentSubscriptionBinding

class SubscriptionFragment : Fragment() {

    private var _binding: FragmentSubscriptionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val subscriptionViewModel =
            ViewModelProvider(this).get(SubscriptionViewModel::class.java)

        _binding = FragmentSubscriptionBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}