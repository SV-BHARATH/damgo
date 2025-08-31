

package com.example.SpringMailSender.dto;

public class RegisterDto 
{
	
    private Long id;
	
	private String name;
	
	private String phoneno;
	
	private String state ;
	
	private String district;
	
	private String acres;
	
	private String email;
	
	private String password;
	
	public RegisterDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAcres() {
		return acres;
	}

	public void setAcres(String acres) {
		this.acres = acres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public RegisterDto(RegisterDtoBuilder builder) {
		this.name = builder.name;
		this.acres=builder.acres;
		this.district=builder.district;
		this.email =builder.email;
		this.password=builder.password;
		this.phoneno=builder.phoneno;
		this.state=builder.state;
		
	}
	
	public class RegisterDtoBuilder
	{
		 private Long id;
			
			private String name;
			
			private String phoneno;
			
			private String state ;
			
			private String district;
			
			private String acres;
			
			private String email;
			
			private String password;

			public RegisterDtoBuilder setId(Long id) {
				this.id = id;
				return this;
			}

			public RegisterDtoBuilder setName(String name) {
				this.name = name;
				return this;
			}

			public RegisterDtoBuilder setPhoneno(String phoneno) {
				this.phoneno = phoneno;
				return this;
			}

			public RegisterDtoBuilder setState(String state) {
				this.state = state;
				return this;
			}

			public RegisterDtoBuilder setDistrict(String district) {
				this.district = district;
				return this;
			}

			public RegisterDtoBuilder setAcres(String acres) {
				this.acres = acres;
				return this;
			}

			public RegisterDtoBuilder setEmail(String email) {
				this.email = email;
				return this;
			}

			public RegisterDtoBuilder setPassword(String password) {
				this.password = password;
				return this;
			}
			
			
			
		
	}
	
}
