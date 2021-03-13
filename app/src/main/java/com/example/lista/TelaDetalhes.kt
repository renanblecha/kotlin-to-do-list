package com.example.lista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class TelaDetalhes : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tela_detalhes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val editarTitulo: TextView = view.findViewById(R.id.editarTitulo)
        editarTitulo.text = ListaAdapter.afazer.titulo

        val editarDescricao: TextView = view.findViewById(R.id.editarDescricao)
        editarDescricao.text = ListaAdapter.afazer.descricao

        val btSalvar: Button = view.findViewById(R.id.btSalvar)
        btSalvar.setOnClickListener {
            ListaAdapter.afazer.titulo = editarTitulo.text.toString()
            ListaAdapter.afazer.descricao =  editarDescricao.text.toString()

            ListaAdapter.afazerDao.update(ListaAdapter.afazer)
             activity?.onBackPressed();
        }

        super.onViewCreated(view, savedInstanceState)


    }



}