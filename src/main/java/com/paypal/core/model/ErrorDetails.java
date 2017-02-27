package com.paypal.core.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
public class ErrorDetails {
    private String field;
    private String issue;
}
