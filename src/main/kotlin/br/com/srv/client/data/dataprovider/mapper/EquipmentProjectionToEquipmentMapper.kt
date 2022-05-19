package br.com.srv.client.data.dataprovider.mapper

import br.com.srv.client.data.core.model.Equipment
import br.com.srv.client.data.dataprovider.entity.EquipmentEntity

class EquipmentProjectionToEquipmentMapper {
    companion object {
        fun convert(equipmentProjection: EquipmentEntity): Equipment {
            return Equipment(equipmentProjection.equipmentName, equipmentProjection.temperature)
        }
    }
}