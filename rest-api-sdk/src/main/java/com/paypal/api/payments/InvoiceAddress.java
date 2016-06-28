package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InvoiceAddress extends BaseAddress {
	
	private Phone phone;
}
