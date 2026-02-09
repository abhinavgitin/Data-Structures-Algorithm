public class DayOfTheYear {
    public static void main(String[] args) {
        DayOfTheYear object = new DayOfTheYear();
        System.out.println(object.dayOfYear("2025-10-11"));
    }

    public int dayOfYear(String date) {
        // it shows to return the days passes for the year
        int noOfdays = 0;
        // int[] daysForEachMonth = { 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
        int[] daysForEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7))-1;
        int day = Integer.parseInt(date.substring(8));
        // one more approach 
        for ( int i = 0 ; i < month ; i++ ) {
            noOfdays += daysForEachMonth[i];
        }
        noOfdays += day;
        if ( checkLeapYear(year) && month > 1) {
            noOfdays += 1;
        }
        return noOfdays;
    }

    boolean checkLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}