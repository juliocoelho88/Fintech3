package br.com.fiap.fintech.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import br.com.fiap.fintech.Transacao

class TransacoesViewModel {
    private val _ultimasTransacoes: MutableState<List<Transacao>> = mutableStateOf(emptyList())
    val ultimasTransacoes: MutableState<List<Transacao>> = _ultimasTransacoes

    fun adicionarTransacao(transacao: Transacao) {
        _ultimasTransacoes.value = _ultimasTransacoes.value + transacao
    }
}