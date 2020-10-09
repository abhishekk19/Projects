package com.example.genericrestapi.service;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.genericrestapi.config.SOAPConnector;
import com.example.genericrestapi.constants.UrlConstants;
import com.example.genericrestapi.createOrder.GetResultReportOPT;
import com.example.genericrestapi.createOrder.GetResultReportOPTResponse;
import com.example.genericrestapi.factory.Diagnostics;
import com.example.genericrestapi.request.ApiRequest;
import com.example.genericrestapi.request.CreateOrderRequest;
import com.example.genericrestapi.request.RegisterUserRequest;
import com.example.genericrestapi.response.CancelOrderInfoResponse;
import com.example.genericrestapi.response.CancelOrderReasonsInfoResponse;
import com.example.genericrestapi.response.CreateOrdeInfoResponse;
import com.example.genericrestapi.response.LabsInfoResponse;
import com.example.genericrestapi.response.OrderDetailsInfoResponse;
import com.example.genericrestapi.response.PhleboSlotsinfoResponse;
import com.example.genericrestapi.response.RegisterUserAddressInfoResponse;
import com.example.genericrestapi.response.RegisterUserInfoResponse;
import com.example.genericrestapi.response.RescheduleOrderInfoResponse;
import com.example.genericrestapi.response.RescheduleReasonsInfoResponse;
import com.example.genericrestapi.response.Response;
import com.example.genericrestapi.response.TestsInfoResponse;
import com.example.genericrestapi.response.TrackOrderInfoResponse;
import com.example.genericrestapi.response.UserInfoResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;

@Service
public class SRLDiagnosticService implements Diagnostics {

	@Autowired
	SOAPConnector WebServicecClient;

	private Gson gson = new Gson();

	private ApiRequest apirequest = new ApiRequest();

	// SRL API
//	@Override
//	public Response getOrderDetails(String orderId) {
//
//		GetOrderStatus orderStatusRequest = apirequest.prepareGetOrderStatus(orderId);
//		GetOrderStatusResponse soapResponse = (GetOrderStatusResponse) WebServicecClient.callWebService(UrlConstants.GET_ORDER_URL,
//				orderStatusRequest,UrlConstants.getOrder_soapActionUrl);
//
//		// Constructing json as we are getting soap response asstring
//		Response response = gson.fromJson(soapResponse.getGetOrderStatusResult(), Response.class);
//		return response;
//	}

	@Override
	public Response getReport(String orderId) {
		GetResultReportOPT resultReport = apirequest.prepareResultReportOPT(orderId);
		GetResultReportOPTResponse soapResponse = (GetResultReportOPTResponse) WebServicecClient
				.callWebService(UrlConstants.GET_REPORT_URL, resultReport, UrlConstants.getReport_soapActionUrl);

		// Constructing json as we are getting soap response asstring
		Response response = gson.fromJson(soapResponse.getGetResultReportOPTResult(), Response.class);
		return response;
	}

	@Override
	public TestsInfoResponse getAllTests() throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestsInfoResponse getTestsBySearchCategory() throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhleboSlotsinfoResponse getPhleboSlots() throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterUserAddressInfoResponse registerUserAddress() throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoResponse getUserDetails(String userId) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailsInfoResponse getOrderDetails(String orderId)
			throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrackOrderInfoResponse trackOrder()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelOrderInfoResponse cancelOrder()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelOrderReasonsInfoResponse[] getCancelOrderReasons()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RescheduleOrderInfoResponse rescheduleOrder()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RescheduleReasonsInfoResponse saveRescheduleReasons()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateOrderRequest createOrder(CreateOrderRequest createOrder) throws DatatypeConfigurationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateOrdeInfoResponse createOrder()
			throws DatatypeConfigurationException, JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LabsInfoResponse getLabs(Double latitude, Double longitude)
			throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterUserInfoResponse registerUser(RegisterUserRequest userInfoRequest)
			throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Response createOrder(CreateOrderRequest createOrderRequest) throws DatatypeConfigurationException {
//
//		CreateOrderOPT request = apirequest.prepareCreateOrderOPT(createOrderRequest);
//		CreateOrderOPTResponse soapResponse = (CreateOrderOPTResponse) WebServicecClient
//				.callWebService(UrlConstants.CREATE_ORDER_URL, request, UrlConstants.createOrder_soapActionUrl);
//
//		// Constructing json as we are getting soap response asstring
//		Response response = gson.fromJson(soapResponse.getCreateOrderOPTResult(), Response.class);
//		return response;
//	}

}
