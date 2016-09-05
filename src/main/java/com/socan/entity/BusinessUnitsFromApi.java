package com.socan.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the business_units_from_api database table.
 * 
 */
@Entity
@Table(name="business_units_from_api")
@NamedQuery(name="BusinessUnitsFromApi.findAll", query="SELECT b FROM BusinessUnitsFromApi b")
public class BusinessUnitsFromApi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="always_opened")
	private String alwaysOpened;

	@Column(name="google_place_url")
	private String googlePlaceUrl;

	private String hours;

	@Column(name="international_phone")
	private String internationalPhone;

	private String name;

	private String phone;

	private String price;

	private String reviews;

	@Temporal(TemporalType.DATE)
	@Column(name="search_date")
	private Date searchDate;

	@Column(name="socan_licensed")
	private byte socanLicensed;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	private String vicinity;

	private String website;

	public BusinessUnitsFromApi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlwaysOpened() {
		return this.alwaysOpened;
	}

	public void setAlwaysOpened(String alwaysOpened) {
		this.alwaysOpened = alwaysOpened;
	}

	public String getGooglePlaceUrl() {
		return this.googlePlaceUrl;
	}

	public void setGooglePlaceUrl(String googlePlaceUrl) {
		this.googlePlaceUrl = googlePlaceUrl;
	}

	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getInternationalPhone() {
		return this.internationalPhone;
	}

	public void setInternationalPhone(String internationalPhone) {
		this.internationalPhone = internationalPhone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReviews() {
		return this.reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public Date getSearchDate() {
		return this.searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}

	public byte getSocanLicensed() {
		return this.socanLicensed;
	}

	public void setSocanLicensed(byte socanLicensed) {
		this.socanLicensed = socanLicensed;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getVicinity() {
		return this.vicinity;
	}

	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}