package capgemini.kafka.dto;

import capgemini.kafka.model.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDTO {

    private int id;

    private String status;

    private String errorMessage;

    //private OrderDTO orderDTO;
    private int orderId;

    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setStatus(payment.getStatus().name());
        paymentDTO.setOrderId(payment.getOrder().getId());
    }
}
