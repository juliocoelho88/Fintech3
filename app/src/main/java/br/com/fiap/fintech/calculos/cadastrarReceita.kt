package br.com.fiap.fintech.calculos

fun cadastrarReceita(valorReceita: Double) {
    // Declaração das variáveis listaReceitas e valorTotalReceitas
    var listaReceitas = mutableListOf<Double>()
    var valorTotalReceitas = 0.0

    // Adiciona o novo valor de receita à lista
    listaReceitas.add(valorReceita)

    // Calcula o valor total recebido somando todos os valores da lista
    for (receita in listaReceitas) {
        valorTotalReceitas += receita
    }

    // Exibe o valor total recebido
    println("Valor total recebido: R$$valorTotalReceitas")
}