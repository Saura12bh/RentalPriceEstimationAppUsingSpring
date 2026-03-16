package org.springMvc.model;

public class Property {
	 private int property_id;

	    private int locationcode;

	    private float area_sqft;

	    private int bedrooms;

	    private int bathrooms;

	    private boolean parking;

	    private float metro_distance;
	    private int price;
		public int getProperty_id() {
			return property_id;
		}
		public void setProperty_id(int property_id) {
			this.property_id = property_id;
		}
		public int getLocationcode() {
			return locationcode;
		}
		public void setLocationcode(int locationcode) {
			this.locationcode = locationcode;
		}
		public float getArea_sqft() {
			return area_sqft;
		}
		public void setArea_sqft(float area_sqft) {
			this.area_sqft = area_sqft;
		}
		public int getBedrooms() {
			return bedrooms;
		}
		public void setBedrooms(int bedrooms) {
			this.bedrooms = bedrooms;
		}
		public int getBathrooms() {
			return bathrooms;
		}
		public void setBathrooms(int bathrooms) {
			this.bathrooms = bathrooms;
		}
		public boolean isParking() {
			return parking;
		}
		public void setParking(boolean parking) {
			this.parking = parking;
		}
		public float getMetro_distance() {
			return metro_distance;
		}
		public void setMetro_distance(float metro_distance) {
			this.metro_distance = metro_distance;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
