package br.mateus.feed.web.dto.response;

import java.time.Instant;

public record LikeResponse(
        Long postId,
        Long userId,
        Instant createdAt
) {}
