package com.paypal.sdk.http;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;

import java.io.IOException;

public interface HttpClient {
    <T> HttpResponse<T> execute(HttpRequest<T> request) throws IOException;
}
