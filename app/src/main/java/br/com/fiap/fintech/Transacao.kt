package br.com.fiap.fintech

data class Transacao(
    val tipo: TipoTransacao,
    val descricao: String,
    val valor: Double
)

enum class TipoTransacao {
    INVESTIMENTO,
    DESPESA,
    RECEITA
}
