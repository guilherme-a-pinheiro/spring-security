package com.pinheiro.testespringsecurity.domain.user;

public record AuthenticationDTO(
        String login,
        String password
) {
}
