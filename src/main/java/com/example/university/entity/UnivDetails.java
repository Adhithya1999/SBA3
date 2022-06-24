package com.example.university.entity;
    import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class UnivDetails {
		
		@Id
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public UnivDetails(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public UnivDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}



}
