package br.com.srv.client.data.dataprovider.client

import br.com.srv.client.data.config.FeignConfiguration
import br.com.srv.client.data.core.model.SendEquipment
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(url = "https://srv-receiver-data.azurewebsites.net", name = "send-data", configuration = [FeignConfiguration::class])
interface SendDataClient {

    @PostMapping("/receiver")
    fun send(@RequestBody body: List<SendEquipment>) {
    }
}
