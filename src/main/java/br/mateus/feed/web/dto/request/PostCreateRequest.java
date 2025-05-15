package br.mateus.feed.web.dto.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import java.util.List;

public record PostCreateRequest(
        @NotBlank
        String content,

        @URL
        List<String> mediaUrls
) {}
