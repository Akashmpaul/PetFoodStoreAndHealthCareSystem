package com.spring.pet.entity;
//import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table

public class Product {
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column
		private Long id;
		
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}



		@Column(name="Name")
		private String name;
		
		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
		private Category category;
		
		
//		@Column(name="category")
//		private String category;
		
		@Column(name="price")
		private double price;

		

		@Column(name="description")
		private String description;

		@Column(name="image_name")
		private String imageName;


		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageName() {
			return imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price
					+ ", description=" + description + ", imageName=" + imageName + "]";
		}
		
		



		

	}
