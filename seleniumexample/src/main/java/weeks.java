public class weeks {

    public static void main(String[] args) {
        String[] weeks = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String[] doubleWeeks = new String[weeks.length * 2] ;

        int j = 22;
        String s = "Sun";
        int index=0;
//find the  index of s in weeks
       for(int i =0 ; i < weeks.length; i++){

           if(weeks[i].equals(s)){
               index = i;
           }

       }
//to build up the double array
       for(int i=0; i<weeks.length; i++){
           //0 to 0
        doubleWeeks[i] = weeks[i];
        //7 to 0
           doubleWeeks[i+7] = weeks[i];
       }

       j = j>7? j%7 : j;

        System.out.println(doubleWeeks[index+j]);


    }
    }

