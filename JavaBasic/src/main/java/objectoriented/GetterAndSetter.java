package objectoriented;



 
public class GetterAndSetter {
 
    public static void main(String[] args) {
     
    	Person person1 = new GetterAndSetter().new Person();
         
        //person1.name = "Daenerys Targaryen";
        //person1.age = 25;
         
    	person1.setName("Daenerys Targaryen");
    	person1.setAge(26);
         
        System.out.println(person1.getName());
    }


    class Person {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setInfo(String name, int age) {
            setName(name);
            setAge(age);
        }
    }
 
}