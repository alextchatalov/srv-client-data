package br.com.srv.client.data.entrypoint.job

import br.com.srv.client.data.core.usecase.ProcessDataClientUseCase
import br.com.srv.client.data.dataprovider.gateway.InsertEquipment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Controller

@Controller
@EnableScheduling
class CollectDataJob {

    @Autowired
    lateinit var processDataClientUseCase: ProcessDataClientUseCase

    @Autowired
    lateinit var insertEquipment: InsertEquipment

    @Scheduled(fixedDelay = 500000)
    fun execute() {
        insertEquipment.execute()
        processDataClientUseCase.execute()
    }
}