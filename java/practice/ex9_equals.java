// equals()
// Each object has a predefined equals() method that is used for semantical equality testing.
// But, to make it work for our classes, we need to override it and check the conditions we need.
// There is a simple and fast way of generating the equals() method, other than writing it manually.
// Just right click in your class, go to Source->Generate hashCode() and equals()...

package soloLearn.java.practice;

public class ex9_equals {
    class Animal {
        String name;

        Animal(String n) {
            name = n;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Animal other = (Animal) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
    }
}

// The automatically generated hashCode() method is used to determine where to store the object internally. Whenever you implement equals, you MUST also implement hashCode.
// We can run the test again, using the equals method:

// public static void main(String[ ] args) {
//     Animal a1 = new Animal("Robby");
//     Animal a2 = new Animal("Robby");
//     System.out.println(a1.equals(a2));
//   }
