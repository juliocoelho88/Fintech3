package br.com.fiap.fintech.calculos

fun cadastrarInvestimento(valorInvestimento: Double) {
    // Declaração das variáveis listaInvestimentos e valorTotalInvestido
    var listaInvestimentos = mutableListOf<Double>()
    var valorTotalInvestido = 0.0

    // Adiciona o novo valor de investimento à lista
    listaInvestimentos.add(valorInvestimento)

    // Calcula o valor total investido somando todos os valores da lista
    for (investimento in listaInvestimentos) {
        valorTotalInvestido += investimento
    }

    // Exibe o valor total investido
    println("Valor total investido: R$$valorTotalInvestido")
}
