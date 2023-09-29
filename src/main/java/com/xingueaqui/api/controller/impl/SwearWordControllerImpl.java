package com.xingueaqui.api.controller.impl;

import com.xingueaqui.api.controller.ISwearWordController;
import com.xingueaqui.api.request.SwearWordRequest;
import com.xingueaqui.api.response.OkStatusResponse;
import com.xingueaqui.api.service.ISwearWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swearword")
public class SwearWordControllerImpl implements ISwearWordController {
    @Autowired
    private ISwearWordService service;

    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<OkStatusResponse> create(SwearWordRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
    }
}
