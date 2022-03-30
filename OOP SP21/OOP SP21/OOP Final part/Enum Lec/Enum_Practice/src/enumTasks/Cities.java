package enumTasks;

public enum Cities {
	
	KARACHI("KARACHI","24.8607° N","67.0011° E"),LAHORE("LAHORE","31.5204° N","74.3587° E"),ISLAMABAD("ISLAMABAD","33.6844° N", "73.0479° E"),QUETTA("QUETTA","30.1798° N", "66.9750° E"),PESHAWAR("PESHAWAR","34.0151° N", "71.5249° E");
	
	private String cityName;
	private String longitude;
	private String lattitude;
	
	private Cities(String cityName,String longitude,String lattitude)
	{
		this.cityName = cityName;
		this.longitude = longitude;
		this.lattitude = lattitude;
	}
	
	public String getCityName() {
		return cityName;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLattitude() {
		return lattitude;
	}

	
	

}
