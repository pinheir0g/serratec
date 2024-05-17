package br.org.serratec.biblioteca.dtos;


public class AddressDto {
	private String city;
	private String street;
	private String number;
	private String zipcode;
	private GeolocationDto geolocation;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipCode) {
		this.zipcode = zipCode;
	}
	public GeolocationDto getGeolocation() {
		return geolocation;
	}
	public void setGeolocation(GeolocationDto geolocation) {
		this.geolocation = geolocation;
	}



}
