package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Data {
    @Id private String id;
    private String usn;
    private String name;

	public String getUsn() {
		return this.usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
