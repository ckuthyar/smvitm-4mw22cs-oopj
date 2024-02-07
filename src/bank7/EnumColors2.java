package bank7;

public enum EnumColors2 {
	BLACK("#000000"),
	RED("#FF0000"),
	GREEN("#00FF00"),
	BLUE("0000FF"),
	WHITE("FFFFFF");
	private String code;
	private EnumColors2(String code) {
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public static void main(String[] args) {
		EnumColors2 enum1=BLACK;
		System.out.println(enum1.name());
		System.out.println(enum1.ordinal());
		System.out.println(enum1.toString());
		System.out.println(enum1.equals(enum1));
		System.out.println(enum1.hashCode());
		System.out.println(enum1.compareTo(enum1));
		System.out.println(enum1.getDeclaringClass());
		System.out.println(enum1.valueOf("RED"));
		//System.out.println(enum1.finalize());}
}
