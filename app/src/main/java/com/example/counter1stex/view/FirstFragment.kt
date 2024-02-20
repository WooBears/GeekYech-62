package com.example.counter1stex.view

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.counter1stex.R
import com.example.counter1stex.databinding.FragmentFirstBinding
import com.example.counter1stex.model.Counter
import com.example.counter1stex.viewmodel.MainViewModel

class FirstFragment : Fragment() {

    private val binding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnInc.setOnClickListener {
            viewModel.inc()
        }

        binding.btnDec.setOnClickListener {
            viewModel.dec()
        }

        viewModel.getCounterLiveData().observe(viewLifecycleOwner) {
            binding.tvShowCounter.text = it.toString()
        }
    }
}