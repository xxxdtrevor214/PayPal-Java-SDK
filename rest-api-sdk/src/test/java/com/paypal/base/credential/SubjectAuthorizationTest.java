package com.paypal.base.credential;

import org.testng.annotations.Test;

public class SubjectAuthorizationTest {

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void illegalArgumentExceptionTest() {
		new SubjectAuthorization(null);
	}
}
