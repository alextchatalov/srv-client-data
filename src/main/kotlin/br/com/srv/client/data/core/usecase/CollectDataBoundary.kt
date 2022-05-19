package br.com.srv.client.data.core.usecase

import br.com.srv.client.data.core.model.Equipment

interface CollectDataBoundary {

    fun execute(): List<Equipment>
}