/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


    public class Clock {
        private BoundedCounter hours;
        private BoundedCounter minutes;
        private BoundedCounter seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
            this.hours=new BoundedCounter(hoursAtBeginning);
            this.minutes=new BoundedCounter(minutesAtBeginning);
            this.seconds=new BoundedCounter(secondsAtBeginning);

        }

        public void tick(){
            this.seconds.next();
            if (this.seconds.getValue()==0){
                this.minutes.next();
            
                if(this.minutes.getValue()==0){
                    if(this.hours.getValue()>23){
                        this.hours.setValue(0);
                     }else{
                        this.hours.next();
                    }
                
                }
            }
        }

        public String toString() {
             return this.hours+"."+this.minutes+"."+this.seconds;
        }
    
}
