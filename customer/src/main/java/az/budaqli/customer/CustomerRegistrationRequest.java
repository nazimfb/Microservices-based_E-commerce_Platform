package az.budaqli.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
