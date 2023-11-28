package com.Blogging.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDto {

	private Integer CategoryId;
	
	@NotBlank
	@Size(min = 4,max = 250,message = "title enter must be 4 character to 25 character")
	private String categoryTitle;
	@NotBlank
	@Size(min = 4,max = 2500,message = "title enter must be 4 character to 250 character")
	private String categoryDescriptions;
}
