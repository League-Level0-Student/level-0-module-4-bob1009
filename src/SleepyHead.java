//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        int val = JOptionPane.showConfirmDialog(null, "is it a weekday");        
       
        if(val == 1) {
        	JOptionPane.showMessageDialog(null, "ok, go back to sleep");
        	System.exit(67); }
        
        if(val == 0) {
        	JOptionPane.showMessageDialog(null, "WAKE UP LAZY BONES, YOU'RE GOING TO BE LATE FOR SCHOOL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        int value = JOptionPane.showConfirmDialog(null, "is it vacation?");        
        
        if(value == 0) {
        	JOptionPane.showMessageDialog(null, "WAKE UP LAZY BONES, YOU'RE GOING TO BE LATE FOR VACATION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        	System.exit(67); }
        if(value == 1) {
        	JOptionPane.showMessageDialog(null, " THEN STILL WAKE UP LAZY BONES, YOU'RE GOING TO BE LATE FOR SCHOOL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        
        
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
   


        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}}}
