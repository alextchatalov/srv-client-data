package br.com.srv.client.data.core.usecase

import br.com.srv.client.data.core.model.SendEquipment

interface SendDataBoundary {

    fun execute(sendEquipments: List<SendEquipment>)
}