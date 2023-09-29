package com.xingueaqui.api.handler.dto;

public record CustomErrorResponse(Integer status, Boolean isError, String message) {
}
