package com.example.genericrestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.genericrestapi.factory.GenericFactory;
import com.example.genericrestapi.factory.Prescription;
import com.example.genericrestapi.healthplix.response.BookDoctorAppointmentResponse;
import com.example.genericrestapi.healthplix.response.DoctorAppointmentSlotResponse;
import com.example.genericrestapi.util.ResponseUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	GenericFactory genericFactory;

	@Autowired
	ResponseUtil responseUtil ;

	@ApiOperation(value = "get Doctor Slots", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved "),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@RequestMapping(value = "{partnerId}/slots/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getDoctorSlots(@PathVariable Long partnerId, @RequestParam String docId,
			@RequestParam String date, @RequestParam String bookingType)
			throws JsonMappingException, JsonProcessingException {

		Prescription prescription = genericFactory.createPrescriptions(partnerId);
		DoctorAppointmentSlotResponse response = prescription.getDoctorSlots();
		if (response == null) {
			return new ResponseEntity<>((responseUtil.generateNoAPIResponse()), HttpStatus.SERVICE_UNAVAILABLE);
		}
		return new ResponseEntity<>((responseUtil.generateGenericResponse(response, responseUtil.getMessage)),
				HttpStatus.OK);
	}

	@ApiOperation(value = "Book Doctor Appointment", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved "),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@RequestMapping(value = "{partnerId}/DoctorAppointment/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> bookDoctorAppointment(@PathVariable Long partnerId)
			throws JsonMappingException, JsonProcessingException {
		Prescription prescription = genericFactory.createPrescriptions(partnerId);
		BookDoctorAppointmentResponse response = prescription.bookDoctorAppointment();
		if (response == null) {
			return new ResponseEntity<>((responseUtil.generateNoAPIResponse()), HttpStatus.SERVICE_UNAVAILABLE);
		}
		return new ResponseEntity<>((responseUtil.generateGenericResponse(response, responseUtil.postMessage)),
				HttpStatus.OK);
	}

}
