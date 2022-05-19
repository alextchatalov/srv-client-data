package br.com.srv.client.data.dataprovider.gateway

import br.com.srv.client.data.core.model.Equipment
import br.com.srv.client.data.dataprovider.entity.EquipmentEntity
import br.com.srv.client.data.dataprovider.repository.EquipmentRepository
import org.springframework.stereotype.Controller

@Controller
class InsertEquipment(val repository: EquipmentRepository) {

    fun execute() {
        for (i in 1..10) {
            repository.save(
                EquipmentEntity(i.toLong(),"Equipment $i","${Math.random()}",)
            )
        }
    }
}