package br.com.srv.client.data.dataprovider.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "equipment")
class EquipmentEntity(@Id val id: Long, val equipmentName: String, val temperature: String)