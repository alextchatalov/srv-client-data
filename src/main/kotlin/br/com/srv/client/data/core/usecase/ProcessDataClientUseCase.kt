package br.com.srv.client.data.core.usecase

import br.com.srv.client.data.core.model.SendEquipment
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class ProcessDataClientUseCase(val collectDataBoundary: CollectDataBoundary, val sendDataBoundary: SendDataBoundary) {

    fun execute() {
        val equipments = collectDataBoundary.execute()
        val sendEquipments = equipments.map { SendEquipment(UUID.randomUUID().toString(), it.equipmentName, it.temperature) }.toList()
        print("Send data to server: $sendEquipments")
        sendDataBoundary.execute(sendEquipments)
    }
}