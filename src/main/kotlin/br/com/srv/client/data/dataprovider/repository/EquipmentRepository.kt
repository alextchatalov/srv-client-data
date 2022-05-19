package br.com.srv.client.data.dataprovider.repository

import br.com.srv.client.data.dataprovider.entity.EquipmentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface EquipmentRepository: JpaRepository<EquipmentEntity, String>{

    @Query("SELECT id as id, \n" +
            "equipment_name, \n" +
            "temperature \n" +
            "FROM equipment \n", nativeQuery = true)
    fun findAllEquipment(): List<EquipmentEntity>
}