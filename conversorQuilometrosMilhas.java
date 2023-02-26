public class SpeedConverter {
 
 public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour >= 0){
            return (Math.round(kilometersPerHour / 1.609) );
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
//        double milesPerHour = Math.round(kilometersPerHour / 1.609);
        int milesPerHour =(int)( toMilesPerHour(kilometersPerHour));
        if(milesPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
 
}
