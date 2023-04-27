public class Main {
    public static void main(String[] args) {
        var listNum = new GenericList<Integer>();
        listNum.add(15);
        int number = listNum.get(0);

        var listDouble = new GenericList<Double>();
        listDouble.add(0.15);
        double myDouble = listDouble.get(0);

        var listString = new GenericList<String>();
        listString.add("fifteen");
        String myString = listString.get(0);
    }
}