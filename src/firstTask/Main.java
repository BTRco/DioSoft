package firstTask;

public class Main {

    public static void main(String[] args) {

        Person bogdan = new Person("Bogdan", "Kyiv", 23, Post.DIRECTOR);
        Person bogdan1 = new Person("Bogdan", "Kharkiv", 23, Post.DIRECTOR);
        Person bogdan2 = new Person("Bogdan Skochynskyi", "Kyiv", 23, Post.DIRECTOR);
        Person bogdan3 = new Person("Bogdan", "Kyiv", 23, Post.QA);
        Person bogdan4 = new Person("Bogdan", "Kyiv", 24, Post.DIRECTOR);
        Person bogdan5 = new Person("Bogdan", "Kyiv", 23, Post.DIRECTOR);

        System.out.println(bogdan.equals(bogdan1)); //Check equals false by String "Address"
        System.out.println(bogdan.equals(bogdan2)); //Check equals false by String "Name"
        System.out.println(bogdan.equals(bogdan3)); //Check equals false by Enum "Post"
        System.out.println(bogdan.equals(bogdan4)); //Check equals false by int "Age"
        System.out.println(bogdan.equals(bogdan5)); //Check equals true by similar objects
        System.out.println(bogdan.equals(bogdan));  //Check eqauls true by the same object
        System.out.println(" ");

        System.out.println(bogdan == bogdan5);      //Check similar objects by ==
        System.out.println(bogdan == bogdan);       //Check the same objects by ==
        System.out.println(" ");

        System.out.println(bogdan.hashCode());
        System.out.println(bogdan2.hashCode());
        System.out.println(bogdan5.hashCode());
        System.out.println(" ");

        Company company = new Company();
        Company company1 = new Company();



        company.addToArray(bogdan);
        company.addToArray(bogdan1);
        company.addToArray(bogdan2);
        company.addToArray(bogdan3);
        company.addToArray(bogdan4);
        company.addToArray(bogdan5);
        company.addToArray(bogdan);
        company.addToArray(bogdan1);
        company.addToArray(bogdan2);
        company.addToArray(bogdan3);
        company.addToArray(bogdan4);
        company.addToArray(bogdan5);

        company1.addToArray(bogdan4);
        company1.addToArray(bogdan1);
        company1.addToArray(bogdan2);
        company1.addToArray(bogdan3);
        company1.addToArray(bogdan4);
        company1.addToArray(bogdan5);
        company1.addToArray(bogdan);
        company1.addToArray(bogdan1);
        company1.addToArray(bogdan2);
        company1.addToArray(bogdan3);
        company1.addToArray(bogdan4);
        company1.addToArray(bogdan5);

        company.outputArray();
        System.out.println(" ");
        company1.outputArray();

        System.out.println(company.equals(company1));


    }
}
