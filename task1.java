public class task1 {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void print() {
            System.out.println("This person is " + this.age + " years old. Person's name is " + this.name);
        }
    }


    public static void main(String[] args) {
        Person person1 = new Person("Igor", 15);
        Person person2 = new Person("Masha", 17);

        person1.print();
        person2.print();


    }
}

