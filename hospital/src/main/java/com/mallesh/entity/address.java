package com.mallesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class address {
	@Id
	private int ahnum;
	@NotNull
	private String apointment;
	@NotNull
	private String area;
	@NotNull
	private String town;
	@NotNull
	private long pnum;
	public int getAhnum() {
		return ahnum;
	}
	public void setAhnum(int ahnum) {
		this.ahnum = ahnum;
	}
	public String getApointment() {
		return apointment;
	}
	public void setApointment(String apointment) {
		this.apointment = apointment;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public long getPnum() {
		return pnum;
	}
	public void setPnum(long pnum) {
		this.pnum = pnum;
	}
	

}
