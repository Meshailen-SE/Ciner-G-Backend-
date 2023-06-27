package com.Crud.SpringbootApplication.Model;

import javax.persistence.*;

@Entity
@Table(name="Documents")
public class Documents {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long document_id;
	
	
	
	@Column(name="contractor_Info")
	private String contractor_Info;
	
	@Column(name="mie_Consent_Forum")
	private String mie_Consent_Forum;
	
	@Column(name="employ_id")
	private long employ_id;
	
	@Column(name="employ_Doc")
	private String[] employ_Doc;
	
	public long getDocument_id() {
		return document_id;
	}

	public void setDocument_id(long document_id) {
		this.document_id = document_id;
	}

	public String[] getEmploy_Doc() {
		return employ_Doc;
	}

	public void setEmploy_Doc(String[] employ_Doc) {
		this.employ_Doc = employ_Doc;
	}

	public String getContractor_Info() {
		return contractor_Info;
	}

	public void setContractor_Info(String contractor_Info) {
		this.contractor_Info = contractor_Info;
	}

	public String getMie_Consent_Forum() {
		return mie_Consent_Forum;
	}

	public void setMie_Consent_Forum(String mie_Consent_Forum) {
		this.mie_Consent_Forum = mie_Consent_Forum;
	}

	public long getEmploy_id() {
		return employ_id;
	}

	public void setEmploy_id(long employ_id) {
		this.employ_id = employ_id;
	}

	
	@Override
	public String toString() {
		return "Documents{" +
                "document_id=" + document_id +
                ", employ_Doc='" + employ_Doc + '\'' +
                ", contractor_Info='" + contractor_Info + '\'' +
                ", mie_Consent_Forum='" + mie_Consent_Forum + '\'' +
                ", employ_id='" + employ_id + '\'' +
                '}';
	}
	
	public Documents get() {
		Documents documents = new Documents();
		return documents;
	}
	
	
	
	
	
}
