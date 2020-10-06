package com.example.genericrestapi.request;

public class CallHealthApiRequest {

	private static final String USER_DETAILS_METHOD = "globalmaster/gcm/corporate/customer/fullDetails";
	private static final String LABS_METHOD = "corporate/services/drReddy/associatesByServiceCodes";
	private static final String POST_TYPE = "POST";
	private static final String GCM_APPLICATION = "gcm";
	private static final String IHS_APPLICATION = "ihs";
	private static final String organizationCode = "100229";
	private static final String tenantCode = "1000143";
	private static final String service_item_code = "DRL00001,DRL00001";

	public UserDetailsRequest prepareUserDetailsRequest(String mrnId) {
		UserDetailsRequest userDetailsRequest = new UserDetailsRequest();
		UserDetailsRequest.Data request = new UserDetailsRequest.Data();
		userDetailsRequest.setMethod(USER_DETAILS_METHOD);
		userDetailsRequest.setType(POST_TYPE);
		userDetailsRequest.setApplication(GCM_APPLICATION);
		request.setMrn(mrnId);
		userDetailsRequest.setRequest(request);
		return userDetailsRequest;
	}

	public LabsInfoRequest prepareLabsInfoRequest(Double latitude, Double longitude) {
		LabsInfoRequest labsInfoRequest = new LabsInfoRequest();
		LabsInfoRequest.Data request = new LabsInfoRequest.Data();
		labsInfoRequest.setMethod(LABS_METHOD);
		labsInfoRequest.setType(POST_TYPE);
		labsInfoRequest.setApplication(IHS_APPLICATION);
		request.setLatitude(latitude);
		request.setLongitude(longitude);
		request.setOrganizationCode(organizationCode);
		request.setService_item_code(service_item_code);
		request.setTenantCode(tenantCode);
		labsInfoRequest.setRequest(request);
		return labsInfoRequest;
	}

}
