package de.walkmod.pmd;

import java.util.Calendar;

import javax.swing.JTextField;

public class RemoveOfUsedVar1 {

    private JTextField jYear;
    private JTextField jMonth;
    private JTextField jDay;

    public void setToday() {
          Calendar today = Calendar.getInstance();
          jYear.setText(String.valueOf(today.get(Calendar.YEAR)));
          jMonth.setText(String.valueOf(today.get(Calendar.MONTH) + 1));
          jDay.setText(String.valueOf(today.get(Calendar.DATE)));
      }

}
