package eletra.model;

public enum EnumModel {
	
	ZEUSDIRETO1("Zeus 8021"),
	ZEUSDIRETO2("Zeus 8023"),
	ZEUSDIRETO3("Zeus 8031"),
	
	ZEUSINDIRETO("Zeus 8023 2,5"),
	
	ARESTB1("Ares 7021"),
	ARESTB2("Ares 7023"),
	ARESTB3("Ares 7031"),
	
	ARESTHS1("Ares 8023 15"),
	ARESTHS2("Ares 8023 200"),
	ARESTHS3("Ares 8023 2,5");
	
	public String model;

	private EnumModel(String model) {
		this.model = model;
	}
	
}
