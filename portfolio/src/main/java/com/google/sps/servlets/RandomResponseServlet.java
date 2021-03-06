package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles requests sent to the /hello URL. Try running a server and navigating
 * to /hello!
 */
@WebServlet("/rand_response")
public class RandomResponseServlet extends HttpServlet {

    /** Random set of messages gathered from google and 
     * https://bestlifeonline.com/world-facts/. */
    private String[] randMessages = 
    {   "Java is completely different than Javascript",
        "The stone (abbreviation st) is a unit of measure equal to 14 pounds " +
            "avoirdupois (about 6.35 kg [nb 1]) used in Great Britain and Ireland" + 
            "for measuring human body weight. In many Northwestern European " +
            "countries the stone was formerly used for trade, with a value ranging" +
            "from about 5 to 40 local pounds (3 to 15 kg).",
        "Japanese cartoonist, Osamu Tezuka, known as the God of Manga and Godfather" +
            " of Anime, invented the distinctive large eyes prominent in both " +
            "manga and anime. His manga series, Astro Boy, went on to become the " +
            "first Japanese television series to embody the aesthetic that became " +
            "known worldwide as anime.", 
        "North Korea and Cuba are the only places you can’t buy Coca-Cola",
        "More people visit France than any other country. Spain was the " +
            "second-most popular destination with 81.8 million visitors, followed " +
            "by the United States, China (60.7 million), and Italy (58.3 million)."+
            " La vie est belle!", 
        "The Paris Agreement on climate change was signed by the largest number of " +
            "countries ever in one day.",
        "The world's quietest room is located at Microsoft's headquarters in " + 
            "Washington state.",
        "Japan is the world's most earthquake-prone country.",
        "More than 52 percent of the world’s population is under 30 years old."
    };

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws IOException {
        response.setContentType("text/html;");
        response.getWriter().println(randString());
    }

    /** Returns a random message from [randMessages] */
    public String randString() {
        int i = (int) (Math.random() * randMessages.length);
        return randMessages[i];
    }
}