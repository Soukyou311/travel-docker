package ltd.newbee.mall.entity;
public class HotelFacility {
    private int hotelId;
    private int facilityId;
    private String facilityType;
    private String facilityName;
    private String facilityIcon;
    private String facilityDescription;
    
    public int getHotelId() {
        return hotelId;
    }
    
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
    
    public String getFacilityType() {
        return facilityType;
    }
    
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }
    
    public String getFacilityName() {
        return facilityName;
    }
    
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
    
    public String getFacilityIcon() {
        return facilityIcon;
    }
    
    public void setFacilityIcon(String facilityIcon) {
        this.facilityIcon = facilityIcon;
    }
    
    public String getFacilityDescription() {
        return facilityDescription;
    }
    
    public void setFacilityDescription(String facilityDescription) {
        this.facilityDescription = facilityDescription;
    }

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
}
