package com.SpringTrial8.StandaloneCollections;

import java.util.List;
import java.util.Map;

public class Smartphone {
	
	private List<String> apps;
	private Map<String, Integer> modelAndPrice;
	
	
	public List<String> getApps() {
		return apps;
	}
	public void setApps(List<String> apps) {
		this.apps = apps;
	}
	public Map<String, Integer> getModelAndPrice() {
		return modelAndPrice;
	}
	public void setModelAndPrice(Map<String, Integer> modelAndPrice) {
		this.modelAndPrice = modelAndPrice;
	}
	@Override
	public String toString() {
		return "Smartphone [apps=" + apps + ", modelAndPrice=" + modelAndPrice + "]";
	}
	
	
	

}
