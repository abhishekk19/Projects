package com.example.genericrestapi.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LabsInfoResponse {

	@JsonProperty("status")
	private String status;

	@JsonProperty("statusCode")
	private int statusCode;

	@JsonProperty("dataObject")
	private List<LabInfo> dataObject;

	@JsonProperty("results_count")
	private Long resultsCount;

	@JsonProperty("reason")
	private String reason;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public List<LabInfo> getDataObject() {
		return dataObject;
	}

	public void setDataObject(List<LabInfo> dataObject) {
		this.dataObject = dataObject;
	}

	public Long getResultsCount() {
		return resultsCount;
	}

	public void setResultsCount(Long resultsCount) {
		this.resultsCount = resultsCount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
