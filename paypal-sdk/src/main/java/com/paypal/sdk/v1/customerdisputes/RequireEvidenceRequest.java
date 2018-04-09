// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// RequireEvidenceRequest.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/6RSwWqDQBC99yuGOS+hZ29psy3SYIKxKaWUuOoYFzau3V0LUvLvZaMxSQO95OY8n/PeG98PJl1DGGBMX600BPxbFlTnBB4g65DhWhgpMkWR2HkmMnyh7jTMyOZGNk7qGgOcguk/BKehbQrhCFxFYJ1/0iUIKKRtWkcMsg7CGfNEkq4iA+nbNEzC6HnztIg3D6/vPN7EfLVcRCuegv7zfsXn83PCBJJK2kEor0S9JaDaG7fH/d5I1nZk/DJLSnlMg22znXRAx+il7qmD0QmE5WFORe5TpiAtpL09vg5nPHrkKesZB/XU5zxbMNzBeq3/Io5Cvc5Bhg0xbxO6uhUynBojuv7v3zOMSRSLWnUYlEJZYsdCFCOwNLoh4yRZDD7G3lhnZL29bkkf4aIrI3TZmOQU2GnI9a5R5OhWh3Wr1P5zf/cLAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A request to update the state of a dispute, by ID, to either `WAITING_FOR_BUYER_RESPONSE` or `WAITING_FOR_SELLER_RESPONSE`. This state change enables either the buyer or seller to submit evidence for the dispute. If the `action` is `BUYER_EVIDENCE`, the `state` of the dispute updates to `WAITING_FOR_BUYER_RESPONSE`. If the action is `,SELLER_EVIDENCE`, the `state` of the dispute updates to `WAITING_FOR_SELLER_RESPONSE`.
 */
@Model
public class RequireEvidenceRequest {

    // Required default constructor
    public RequireEvidenceRequest() {}

	/**
	* The action to complete.
	*/
	@SerializedName("action")
	private String action;

	public String action() { return action; }
	
	public RequireEvidenceRequest action(String action) {
	    this.action = action;
	    return this;
	}
}
