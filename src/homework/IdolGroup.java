package homework;

class IdolGroup {
	private String name;
	private int age;
	private int height;
	
	public IdolGroup(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void printName() {
		System.out.printf("그룹 이름: %s", name);
	}

	public void printAge() {
		System.out.printf("평균 나이: %d", age);
	}

	public void printHeight() {
		System.out.printf("평균 신장: %d", height);
	}

}

class IdolMember extends IdolGroup {
	private String position;
	private String name;
	private int age;
	private int height;

	public IdolMember(String name, int age, int height) {
		super("name", 12, 22);
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void printPosition() {
		System.out.printf("포지션: %s", position);
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public static void main(String[] args) {
		IdolGroup group = new IdolGroup("group", 33, 176);
		group.printName();
		group.printAge();
		group.printHeight();

		IdolMember member = new IdolMember("jdk", 29, 177);
		member.printName();
		member.printAge();
		member.printHeight();
		member.setPosition("메인 보컬");
		member.printPosition();
	}
}