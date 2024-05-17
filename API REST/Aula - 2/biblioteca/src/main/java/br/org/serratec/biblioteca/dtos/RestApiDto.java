package br.org.serratec.biblioteca.dtos;

public class RestApiDto {

	private String id;
	private String email;
	private String username;
	private String password;
	private NameDto name;
	private AddressDto address;
	private String phone;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public NameDto getName() {
		return name;
	}
	public void setName(NameDto name) {
		this.name = name;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}



}
