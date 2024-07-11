package az.budaqli.clients.notification;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerName;
    private String message;
}
