package br.mateus.feed.web.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record PostResponse(
        Long id,
        String content,
        List<String> mediaUrls,
        UserResponse author,
        LocalDateTime createdAt,
        int likeCount,
        List<CommentResponse> comments
)
{}
