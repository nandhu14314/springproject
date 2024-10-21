package com.mallesh.dto;

import java.util.List;

import com.mallesh.entity.address;
import com.mallesh.entity.caretaker;

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

public class patientdto {
	private int pid;
	private String pname;
	private int page;
	private char pgender;
	private String pdob;
	private String pcon;
	private address ad;
	private List<caretaker> ct;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public char getPgender() {
		return pgender;
	}
	public void setPgender(char pgender) {
		this.pgender = pgender;
	}
	public String getPdob() {
		return pdob;
	}
	public void setPdob(String pdob) {
		this.pdob = pdob;
	}
	public String getPcon() {
		return pcon;
	}
	public void setPcon(String pcon) {
		this.pcon = pcon;
	}
	public address getAd() {
		return ad;
	}
	public void setAd(address ad) {
		this.ad = ad;
	}
	public List<caretaker> getCt() {
		return ct;
	}
	public void setCt(List<caretaker> ct) {
		this.ct = ct;
	}
	

}
