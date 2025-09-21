public class day14 {
    public static void main(String[] args) {
        //String ke int
        String teksint = "12";
        int hasilint = Integer.parseInt(teksint);
        System.out.println("String ke int: " + hasilint);

        //String ke double
        String teksdouble  = "12.3";
        double hasildouble = Double.parseDouble(teksdouble);
        System.out.println("String ke double: "+ hasildouble);

        //String ke long
        String tekslong = "12";
        long hasillong = Long.parseLong(tekslong);
        System.out.println("String ke long: " +hasillong);

        //String ke float
        String teksfloat = "25.22";
        float hasilfloat = Float.parseFloat(teksfloat);
        System.out.println("String ke float: " +hasilfloat);

        //String ke short
        String teksshort = "2006";
        short hasilshort = Short.parseShort(teksshort);
        System.out.println("String ke short: " + hasilshort);

        //String ke byte
        String teksbyte = "50";
        byte hasilbyte = Byte.parseByte(teksbyte);
        System.out.println("String ke byte: " + hasilbyte);

        //String ke boolean
        String teksboolean = "true";
        boolean hasilboolean = Boolean.parseBoolean(teksboolean);
        System.out.println("String ke boolean: " + hasilboolean);
    }
}
