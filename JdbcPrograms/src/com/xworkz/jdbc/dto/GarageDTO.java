package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GarageDTO {
	
	String name;
	String location;
	String type;
	int cost;
	

}
