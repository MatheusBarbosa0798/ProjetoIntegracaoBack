package eletra.model;

public enum EnumCategory {
	
	ARES("Ares Tarifa Branca", "Ares THS"),
	ZEUS("Direto","Indireto");
	
	public String catg1;
	public String catg2;

	private EnumCategory(String catg1, String catg2) {
		this.catg1 = catg1;
		this.catg2 = catg2;
	}
	
}
