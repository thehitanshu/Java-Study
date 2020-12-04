public class DataTypes {
    public static void main (String[] args) {
        System.out.println("New Module");

        /*
        short = -32768: 32767
        long = 9,223,372,036,854,775,808
        */

        //byte = -128 : 127
        byte myByte = 127;
        System.out.println(myByte);

        //int   =  -2, 147, 483, 648
        int mInt = 7;
        System.out.println("Int value is:" + mInt);

        //float = 234.2f
        float mFlot = 7;
        System.out.println("Flot value is:" + mFlot);

        //double = -231.23
        double mDouble = 7;
        System.out.println("Double value is:" + mDouble);

        //boolean = true/false
        boolean isActive = false;
        System.out.println(isActive);

        //char = 'H'
        char mChar = 'H';
        String myValue = Integer.toHexString(mChar);
        System.out.println(myValue);

        //String
        String mString = "I am a String";
        System.out.println(mString);

        String fakeValue = "22.987";
        String fackValueTwo = "33.654";
        System.out.println(fakeValue + " " + fackValueTwo);
        System.out.println(mString.toUpperCase());

        //Unicode
        char mUnicode = '\u0080';
        System.out.println(mUnicode);

    }
}
