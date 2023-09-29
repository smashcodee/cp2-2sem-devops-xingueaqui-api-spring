package com.xingueaqui.api.controller;

import com.xingueaqui.api.request.SwearWordRequest;
import com.xingueaqui.api.response.OkStatusResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface ISwearWordController {
    ResponseEntity<OkStatusResponse> create(@RequestBody @Valid SwearWordRequest request);
}
