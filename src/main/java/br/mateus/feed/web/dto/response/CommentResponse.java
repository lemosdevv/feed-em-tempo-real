package br.mateus.feed.web.dto.response;

import java.time.LocalDateTime;

public record CommentResponse(
        Long id,
        String text,
        UserResponse author,
        LocalDateTime createdAt
){}
