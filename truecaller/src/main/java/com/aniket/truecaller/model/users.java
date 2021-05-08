package com.aniket.truecaller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {
		@Id
		private int id;
		private String name;
		private String phone;
		private String email;
		private boolean spam;
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isSpam() {
			return spam;
		}
		public void setSpam(boolean spam) {
			this.spam = spam;
		}
}
