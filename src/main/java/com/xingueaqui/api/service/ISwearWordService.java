package com.xingueaqui.api.service;

import com.xingueaqui.api.request.SwearWordRequest;
import com.xingueaqui.api.response.OkStatusResponse;

public interface ISwearWordService {
    OkStatusResponse create(SwearWordRequest request);
}
