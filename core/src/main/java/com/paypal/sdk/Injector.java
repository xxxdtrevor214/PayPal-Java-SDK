package com.paypal.sdk;

import java.io.IOException;

public interface Injector {
	<T> void inject(HttpRequest<T> request) throws IOException;
}
