public class task2 {
    public static class Dog {
        int age;
        String breed;

        public Dog(int age, String breed) {
            this.age = age;
            this.breed = breed;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void print() {
            System.out.println("This dog's breed is " + this.breed + ", and age is " + this.age);
        }
    }

    public static void main(String[] args) {
        Dog dog_1 = new Dog(3, "Corgi");
        Dog dog_2 = new Dog(2, "Dachshund");

        dog_1.print();
        dog_2.print();

        dog_2.setBreed("Tariff");
        dog_2.print();

        dog_1.setAge(5);
        dog_1.print();

    }

}
