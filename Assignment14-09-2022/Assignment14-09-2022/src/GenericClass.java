class Dog{
	Object obj;
	Object getObject() {
		return obj;
	}
	void putObject(Object obj) {
		this.obj=obj;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String toString() {
		return "I am a Dog";
	}
}
	class Cat{
		public String toString() {
			return "I am a Cat";
		}
	}
	class Tiger{
		public String toString() {
			return "I am a Tiger";
		}
	}
	public class GenericClass{
		public static void main (String[] args) {
			Dog dog=new Dog();
			Cat cat=new Cat();
			Tiger tiger=new Tiger();
			dog.putObject(cat);
			Object obj=dog.getObject();
			Cat c=(Cat)obj;
			System.out.println(c);
			
			dog.putObject(tiger);
			Tiger t=(Tiger)dog.getObject();
			System.out.println(t);
			
			
		}
	}

