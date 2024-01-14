
public class Session1 {

    static int data = 100;

    static void show() {
        System.out.println("show call");
    }

    public static void main(String args[]) {
        System.out.println("have a happy day");

        Session1.show();
        System.out.println("the value of data is " + Session1.data);
        PQR p1 = new PQR();
        p1.call();
    }
}

class PQR {
    void call() {
        System.out.println("BE KIND");
    }
}

/*
 * public class Session1
 * {
 * public static void main(String[] args)
 * {
 * System.out.println("Hello Java!!!!");
 * }
 * }
 */

// Inside Class Content -
// -Data Members
// -Member Functions
// To Access DM & MF Then First Create Object Of This Class.
// Memory Allocated!!!

/*
 * public class Session1
 * {
 * int data=100;
 * void show()
 * {
 * System.out.println("Show Call");
 * }
 * public static void main(String[] args)
 * {
 * System.out.println("Hello Java!!!!");
 * Session1 s1=new Session1();
 * 
 * s1.show();
 * System.out.printf("Data is %d\n",s1.data);
 * System.out.printf("Data is " + s1.data);
 * }
 * }
 */

// static Variable , static member function
// Access Then No Need To Create Object & Then Call.
// Memory Save

/*
 * public class Session1
 * {
 * static int data=100;
 * static void show()
 * {
 * System.out.println("Show Call");
 * }
 * public static void main(String[] args)
 * {
 * show();
 * Session1.show();//Better Way To Access
 * System.out.println("Data is " + data);
 * System.out.println("Data is " + Session1.data);
 * }
 * }
 */

/*
 * public class Session1
 * {
 * static int data=100;
 * static void show()
 * {
 * System.out.println("Show Call");
 * }
 * public static void main(String[] args)
 * {
 * show();
 * Session1.show();//Better Way To Access
 * System.out.println("Data is " + data);
 * System.out.println("Data is " + Session1.data);
 * 
 * PQR p1=new PQR();
 * p1.call();
 * }
 * }
 * 
 * class PQR
 * {
 * void call()
 * {
 * System.out.println("PQR- Call Called");
 * Session1.show();
 * System.out.println("Data is " + Session1.data);
 * }
 * }
 */
