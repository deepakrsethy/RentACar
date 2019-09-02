package com.deepak.rentACar.controller;

import javax.ws.rs.core.Response;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRmsEmailController {

	@GetMapping("/callemail")
	public String callRmsEmail() {
		RestTemplate restTemplate = new RestTemplate();
		
		 String auth = "A909468:rmsadm1n";		    
		 byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(/*Charset.forName("IS646-US")*/));		 
		 String s = new String(encodedAuth);
		 String authHeader = "Basic"+s;
		
		HttpHeaders headers = new HttpHeaders();
	    headers.set("Accept", "application/vnd.johndeere.sa.sendEmailNotification.v1+json");   
	    headers.set("Content-Type", "application/vnd.johndeere.sa.sendEmailNotification.v1+json"); 
	    headers.set("Authorization", authHeader);
	    
	    Input body = new Input("Remote", new String[] {"5473279","5473279"}, "3515341");
	    		
		HttpEntity<Input> httpEntity = new HttpEntity<>(body,headers);
		ResponseEntity<Response> response = null;
				
		try{
			response = restTemplate.postForEntity("http://sarrmscert.deere.com/rms/services/status-emails/user-notifications", httpEntity, Response.class);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "success";
		
	}
	
	class Input{
		public String taskType;
		public String[] taskIds;
		public String activityId;
		
		public Input(String taskType,String[] taskIds, String activityId ) {
			this.taskType = taskType;
			this.taskIds = taskIds;
			this.activityId = activityId;
		}
		
		public String getTaskType() {
			return taskType;
		}
		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}
		public String[] getTaskIds() {
			return taskIds;
		}
		public void setTaskIds(String[] taskIds) {
			this.taskIds = taskIds;
		}
		public String getActivityId() {
			return activityId;
		}
		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}
		
		
		
		//":"Remote", "taskIds":["5473279","5473279"], "activityId":"3515341"}
	}
}
