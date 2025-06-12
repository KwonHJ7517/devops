package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "project_food")
@Data
public class FoodEntity {
	@Id
	private int fno;
	private String name,type,phone,address,theme,poster,images,time,parking,content,price;
	private double score;
}
