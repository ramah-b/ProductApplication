package myProducts;

public class Software extends Product{
	private String version;
	
	public Software(){
		super();
		this.version = "";
		
	
	}

	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version){
		this.version = version;
	}

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
	
}
