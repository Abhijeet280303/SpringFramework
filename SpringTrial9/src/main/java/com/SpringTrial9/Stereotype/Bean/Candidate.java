package com.SpringTrial9.Stereotype.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("CandidateObject")
public class Candidate {
	
	@Value("Stephen Daertingle")
	private String candiadate_name;
	
	@Value("1001")
	private int uid;
	
	public String getCandiadate_name() {
		return candiadate_name;
	}
	public void setCandiadate_name(String candiadate_name) {
		this.candiadate_name = candiadate_name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Candidate [candiadate_name=" + candiadate_name + ", uid=" + uid + "]";
	}
	
	
	
	
	
}
