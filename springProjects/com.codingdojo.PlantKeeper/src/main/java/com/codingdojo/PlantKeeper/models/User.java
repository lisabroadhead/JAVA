package com.codingdojo.PlantKeeper.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=2,max=50, message="First name cannot be blank")
	private String firstName;
	
	@NotNull
	@Size(min=2,max=50, message="First name cannot be blank")
	private String lastName;
	
	@NotNull
	@Email(message="Email cannot be blank")
	private String email;
	
	@NotNull
	@Size(min=8,max=128,message="Must have a password")
	private String password;
	
	@Transient
	@Size(min=8,max=128,message="Must have a password")
	private String confirm;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    // RELATIONSHIPS
    
    // CONSTRUCTORS
    public User() {
		super();
	}

	public User(Long id, @NotNull @Size(min = 2, max = 50, message = "First name cannot be blank") String firstName,
			@NotNull @Size(min = 2, max = 50, message = "First name cannot be blank") String lastName,
			@NotNull @Email(message = "Email cannot be blank") String email,
			@NotNull @Size(min = 8, max = 128, message = "Must have a password") String password,
			@Size(min = 8, max = 128, message = "Must have a password") String confirm, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public User(@NotNull @Size(min = 2, max = 50, message = "First name cannot be blank") String firstName,
			@NotNull @Size(min = 2, max = 50, message = "First name cannot be blank") String lastName,
			@NotNull @Email(message = "Email cannot be blank") String email,
			@NotNull @Size(min = 8, max = 128, message = "Must have a password") String password,
			@Size(min = 8, max = 128, message = "Must have a password") String confirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
	}
    
    
    // GETTERS / SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	 @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
		
		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
