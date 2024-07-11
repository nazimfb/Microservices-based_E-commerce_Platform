package az.budaqli.clients.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}
