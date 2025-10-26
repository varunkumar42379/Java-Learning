class Outer {
    int outerInstanceVar = 10;
    static int outerStaticVar = 20;

    // --- 1. Non-Static Nested Class (Inner Class) ---
    class Inner {
        void printInner() {
            // Can access both instance and static members of Outer
            System.out.println("Inner can access: " + outerInstanceVar); // Accesses instance var
            System.out.println("Inner can access: " + outerStaticVar);   // Accesses static var
        }
    }

    // --- 2. Static Nested Class ---
    static class StaticNested {
        void printStaticNested() {
            // Cannot access instance members, only static members of Outer
            // System.out.println(outerInstanceVar); // ERROR!
            System.out.println("StaticNested can access: " + outerStaticVar); // Accesses static var
        }
    }
}

class StaticMain {
    public static void main(String[] args) {
        // Instantiating Inner Class (requires Outer object)
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInner();

        // Instantiating Static Nested Class (does NOT require Outer object)
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.printStaticNested();
    }
}