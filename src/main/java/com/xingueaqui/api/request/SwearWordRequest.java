package com.xingueaqui.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingueaqui.api.enums.SwearWordCategorieEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SwearWordRequest(
    @JsonProperty(value = "swear_word")
    @NotBlank(message = "swear word is mandatory.")
    String swearWord,
    @NotNull(message = "categorie is mandatory.")
    SwearWordCategorieEnum categorie
) {
}
