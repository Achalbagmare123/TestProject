

	class Animal<T>{ //T IS GENERIC TYPE
		T obj;
		T getObject() {
			return obj;
		}
		void putObject(T obj) {
			this.obj=obj;
		}
		public Object getObj() {
			return obj;
		}
		public void setObj(T obj) {
			this.obj = obj;
		}
		public String toString() {
			return "I am a Animal";
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
		public class GenericClass1{
			public static void main (String[] args) {
				Animal<Cat> animal1=new Animal<Cat>();
				animal1.putObject(new Cat());
				Cat cat=animal1.getObject();
				System.out.println(cat);
				
				Animal<Tiger> animal2=new Animal<Tiger>();
				animal2.putObject(new Tiger());
				Tiger tiger=animal2.getObject();
				System.out.println(tiger);
			}
		}



