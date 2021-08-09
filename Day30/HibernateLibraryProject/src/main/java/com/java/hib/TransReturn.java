package com.java.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TransReturn")
public class TransReturn {

		private String userName;
		private int bookid;
		private String fromdate;
		private String toDate;
		private int tid;
		@Id
		@Column(name="tid")
		public int getTid() {
			return tid;
		}
		public void setTid(int tid) {
			this.tid = tid;
		}
		@Column(name="username")
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Column(name="bookid")
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		@Column(name="fromdate")
		public String getFromdate() {
			return fromdate;
		}
		public void setFromdate(String fromdate) {
			this.fromdate = fromdate;
		}
		@Column(name="todate")
		public String getToDate() {
			return toDate;
		}
		public void setToDate(String toDate) {
			this.toDate = toDate;
		}
		
}
