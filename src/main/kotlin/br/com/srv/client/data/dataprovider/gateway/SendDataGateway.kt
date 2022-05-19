package br.com.srv.client.data.dataprovider.gateway
import br.com.srv.client.data.core.model.SendEquipment
import br.com.srv.client.data.core.usecase.SendDataBoundary
import br.com.srv.client.data.dataprovider.client.SendDataClient
import org.springframework.stereotype.Controller

@Controller
class SendDataGateway(val sendDataClient: SendDataClient): SendDataBoundary {
    override fun execute(sendEquipments: List<SendEquipment>) {
        sendDataClient.send(sendEquipments)
    }


}