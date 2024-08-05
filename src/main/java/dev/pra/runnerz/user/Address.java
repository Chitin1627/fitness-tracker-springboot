package dev.pra.runnerz.user;

public record Address(
        String street,
        String suit,
        String city,
        String zipcode,
        Geo geo
) {
}
