package com.socan.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the music_subscriber database table.
 * 
 */
@Entity
@Table(name="music_subscriber")
@NamedQuery(name="MusicSubscriber.findAll", query="SELECT m FROM MusicSubscriber m")
public class MusicSubscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address1;

	private String city;

	@Column(name="customer_name")
	private String customerName;

	private String pc;

	private String provive;

	private int supplier;

	public MusicSubscriber() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPc() {
		return this.pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getProvive() {
		return this.provive;
	}

	public void setProvive(String provive) {
		this.provive = provive;
	}

	public int getSupplier() {
		return this.supplier;
	}

	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}

}