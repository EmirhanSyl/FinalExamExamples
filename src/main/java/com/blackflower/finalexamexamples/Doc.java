package com.blackflower.finalexamexamples;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Doc extends Person {

    ArrayList<Shift> shifts = new ArrayList<>();
    Hospital hospital;

    void PrintAddress() {
        System.out.println(super.addresses);
    }

    int ShowShifts() {
        if (hospital instanceof Private) {
            Private privateHosp = (Private)hospital;
            int totalWorkHours = 0;
            for (Shift shift : shifts) {
                totalWorkHours = shift.lastHour - shift.firstHour;
            }
            return totalWorkHours * privateHosp.shiftingFee;
        }else{
            return 0;
        }
    }
    
    @Override
    int GetPersonSalary(){
        return ShowShifts() + super.GetPersonSalary();
    }

    void AddShift(Shift shift) {
        shifts.add(shift);
    }
}
