package br.mateus.feed.web.dto.response;

import java.time.LocalDateTime;

public record UserResponse(
        Long id,
        String username,
        String bio,
        String profilePictureUrl,
        LocalDateTime createdAt
) {}
