package myProducts;

public class Software extends Product {
	private String version;

	public Software() {
		super();
		this.version = "";

	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String toString(String detail) {
		if (detail.equals("d")) {
			return super.toString() + "Version:     " + version + "\n";
		} else {
			return super.toString();
		}
	}

}
