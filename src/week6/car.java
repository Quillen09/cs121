package week6;

public class car {
        //member variables/instant variables/fields
        String make, model, vin, color;
        private int year;
        int miles;
        boolean isElectric;

        //default constructor


        car(){
            this.year = 2000;
            this.make = "empty";
            this.model = "empty";
            this.vin = "numbers";
            this.color = "white";
        }
        car(String make, int year, boolean isElectric){
            this.make = make;
            this.year = year;
            this.isElectric = isElectric;

        }
        public void setYears(int years){
            this.year = years;
        }
        public int getYear(){
            return year;
        }
    }
