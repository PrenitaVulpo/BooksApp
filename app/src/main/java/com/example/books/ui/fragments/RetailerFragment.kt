package com.example.books.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.books.R
import com.example.books.ui.adapter.RetailerAdapter
import com.example.books.ui.adapter.RetailerListAdapter
import com.example.books.ui.viewmodel.RetailerViewModel
import kotlinx.android.synthetic.main.fragment_book_price.*

class RetailerFragment(val volumeID: String): Fragment(), RetailerListAdapter.ItemClickListener {
    private val viewModel: RetailerViewModel by lazy {
        ViewModelProvider(this).get(RetailerViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(
            R.layout.fragment_book_price,
            container,
            false
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.estado.observe(viewLifecycleOwner, Observer { estado ->
            when (estado) {
                is RetailerViewModel.Estado.Carregando -> {
                    progressLayout.visibility = View.VISIBLE
                }
                is RetailerViewModel.Estado.Carregado -> {
                    progressLayout.visibility = View.GONE
                    val retailerAdapter =
                        RetailerListAdapter(estado.list, this)
                    rvRetailer.layoutManager = LinearLayoutManager(requireContext())
                    rvRetailer.adapter = retailerAdapter
                }
                is RetailerViewModel.Estado.Erro -> {
                    progressLayout.visibility = View.GONE
                    if (!estado.hasConsumed) {
                        Toast.makeText(
                            requireContext(),
                            R.string.error_load_book, Toast.LENGTH_LONG
                        )
                    }
                }
            }
        })
        viewModel.loadRetailer(volumeID)
    }
    override fun onItemClick(position: Int, link: String) {
        Log.i("teste", "click regisrado")
        val browserIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(browserIntent)
    }

    override fun onLongClick(position: Int, link: String) {
        Log.i("teste", "click regisrado")
        val browserIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(browserIntent)
    }
}