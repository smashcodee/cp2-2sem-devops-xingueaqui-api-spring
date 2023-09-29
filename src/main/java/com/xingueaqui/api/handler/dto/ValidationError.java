package com.xingueaqui.api.handler.dto;

import java.util.List;

public record ValidationError(Integer status, Boolean isError, List<ValidationFieldError> listErrors) {
}
