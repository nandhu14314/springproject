package com.mallesh.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
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
public class patient {
	@Id
	private int pid;
	@NotBlank
	private String pname;
	@Min(18)
	private int page;
	@NotNull
	private char pgender;
	@NotNull
	private String pdob;
	@NotBlank
	private String pcon;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkpid")
	private address ad;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fkcid")
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
