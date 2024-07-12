package com.wwsis.sss.dao;

import java.util.List;
import com.pl.wwsis.sss.model.TimeSlot;

public interface TimeSlotDao {
    List<TimeSlot> getAllTimeSlots();
    TimeSlot getTimeSlotById(String slotCode);
    void saveTimeSlot(TimeSlot timeSlot);
    void updateTimeSlot(TimeSlot timeSlot);
    void deleteTimeSlot(String slotCode);
}
