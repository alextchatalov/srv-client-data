package br.com.srv.client.data.dataprovider.gateway

import br.com.srv.client.data.core.model.Equipment
import br.com.srv.client.data.core.usecase.CollectDataBoundary
import br.com.srv.client.data.dataprovider.mapper.EquipmentProjectionToEquipmentMapper
import br.com.srv.client.data.dataprovider.repository.EquipmentRepository
import org.springframework.stereotype.Controller

@Controller
class CollectDataGateway(val repository: EquipmentRepository) : CollectDataBoundary {

    override fun execute(): List<Equipment> {
        val equipmentProjections = repository.findAllEquipment()
        return equipmentProjections.map { EquipmentProjectionToEquipmentMapper.convert(it) }.toList()
    }
}