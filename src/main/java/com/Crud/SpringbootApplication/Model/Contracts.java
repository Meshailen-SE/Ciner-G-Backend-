package com.Crud.SpringbootApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

//@Entity
//@Table(name = "Files")
public class Contracts {
	  
	@Id
	private long id;

	  //@Column(name="name")
	  private String name;
	  
	  //@Column(name="url")
	  private String url;

	  public Contracts(String name, String url) {
	    this.name = name;
	    this.url = url;
//	    this.id =id;
	  }

	  public String getName() {
	    return this.name;
	  }
//	  public long getId() {
//			return id;
//		}

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getUrl() {
	    return this.url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }
//	  public void setid(long id) {
//		    this.id = id;
//		  }
	}