package TestGroupId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("p", 10);
        Person p2 = new Person("p", 10);
        System.out.printf( "%b", p1.equals(p2));
    }

    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Person person = (Person)obj;
            if ( person.age == this.age && this.name.equals(person.name) ) {
                return true;
            } else {
                return false;
            }
        }

    }

}
