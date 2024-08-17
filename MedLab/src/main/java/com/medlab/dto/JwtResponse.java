package com.medlab.dto;

public class JwtResponse {
	private String token;
    private String refreshToken;
    private Long id;
    private String email;
    private String role;

    public JwtResponse(String token, String refreshToken, Long id, String email, String role) {
        this.token = token;
        this.refreshToken = refreshToken;
        this.id = id;
        this.email = email;
        this.role = role;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
