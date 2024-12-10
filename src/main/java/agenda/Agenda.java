package agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Description : An agenda that stores events
 */

public class Agenda {

    private final List<Event> events = new ArrayList<>();
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        events.add(e);
    }
    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return a list of events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        List<Event> eventsInDay = new ArrayList<>();
        for (Event e : events) {
            if (e.isInDay(day)) {
                eventsInDay.add(e);
            }
        }
        return eventsInDay;
    }
}

