package myTreeSet;

public class Country implements Comparable{
	
	String name;
	String pm;
	int code;
	
	public Country(String name, String pm, int code) {
		
		this.name = name;
		this.pm = pm;
		this.code = code;
	}
	
	
	
	public int hashCode(){
		
		return ((int) code * pm.hashCode());
	}
	
	public boolean equals(Object ob){
		
		if (ob instanceof Country ) {
			
			
			Country c = (Country) ob;
			
			return (c.name.equals(this.name) && c.pm.equals(this.pm));
			
			
		}else{
			  
			return false;
		}
	}
	
	public int compareTo(Object ob){
		
		Country c = (Country) ob;
		return(name.compareTo(c.name));
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
