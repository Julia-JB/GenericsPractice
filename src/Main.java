public class Main {
    public static void main(String[] args) {
        var listNum = new GenericList<Integer>(); // Only use a reference type as a generic type argument
        listNum.add(15);
        int number = listNum.get(0);

        var listDouble = new GenericList<Double>();
        listDouble.add(0.15);
        double myDouble = listDouble.get(0);

        var listString = new GenericList<String>();
        listString.add("fifteen");
        String myString = listString.get(0);

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); //Boxing
        numbers.get(0); //Unboxing

        // Comparable interface
        var user1 = new User(10);
        var user2 = new User(20);

        if(user1.compareTo(user2) < 0) {
            System.out.println("user1 < user2");
        } else if (user1.compareTo(user2) == 0) {
            System.out.println("user1 == user2");
        } else {
            System.out.println("user1 > user2");
        }

        var max = Utils.max(3, 5);
        System.out.println(max);

        var maxPoints = Utils.max(user1, user2);
        System.out.println(maxPoints);

        Utils.print(1, 10);

        User user = new Instructor(15);

        GenericList<User> users = new GenericList<>();
        GenericList<User> instructors = new GenericList<>();
        users.add(user1);
        users.add(user2);

        var instructor1 = new Instructor(24);
        var instructor2 = new Instructor(30);
        instructors.add(instructor1);
        instructors.add(instructor2);

        Utils.printUsers(users);
        Utils.printUsers(instructors);
        Utils.printUsers(new GenericList<User>());
        Utils.printUsers(new GenericList<Instructor>());
    }
}