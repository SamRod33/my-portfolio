/** Contact contains a name, email, and contact message
 * Contact provides minimal functionality:
 *      - creates an object from given name, email, and message
 *      - upon creation of Contact, record date and time in America/Puerto Rico
 *          time
 *      - accessor methods for each attribute
 * 
 * @author: Samuel Rodriguez (samuelrprofessional@gmail.com)
 * @since: 03/19/2021
 */
package com.google.sps;
import java.time.LocalDateTime;
import java.time.ZoneId;

 public class Contact {
     private String name;
     private String email;
     private String message;
     // TODO: create Date obj to represent this instead
     private String dateTime;

    public Contact(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
        // I want it to be in my local timezone
        dateTime = currentDateTime("America/Puerto_Rico");
    }

    /** Returns the current date/time from the system and converts it
     * into the specified timezone. Requires that timezone is a valid
     * timezone from ZoneId.
     */
    public String currentDateTime(String timezone) {
        return LocalDateTime.now(ZoneId.of(timezone)).toString();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMsg() {
        return message;
    }

    public String getDateTime() {
        return dateTime;
    }
 }