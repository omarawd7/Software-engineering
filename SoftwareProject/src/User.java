  class User {
	    private String UserName;
	    private String Name;
		private String password;
	    private String Phone;
	    private String eMail;
	 //   private String nationalID;

	    public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
	    public String getUserName() {
	        return UserName;
	    }

	    public User(String UserName,String Name, String password, String Phone, String eMail) {
	        this.UserName = UserName;
	        this.Name = Name;
	        this.password = password;
	        this.Phone = Phone;
	        this.eMail = eMail;
	    //    this.nationalID = nationalID;
	    }

	    public User() {
			// TODO Auto-generated constructor stub
		}

		public void setUserName(String UserName) {
	        this.UserName = UserName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getPhone() {
	        return Phone;
	    }

	    public void setPhone(String Phone) {
	        this.Phone = Phone;
	    }

	    public String geteMail() {
	        return eMail;
	    }

	    public void seteMail(String eMail) {
	        this.eMail = eMail;
	    }

	 /*   public String getNationalID() {
	        return nationalID;
	    }

	    public void setNationalID(String nationalID) {
	        this.nationalID = nationalID;
	    }

*/
}
