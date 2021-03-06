/** Fetches random messages from RandomResponseServlet.java */
async function showRandText() {
    const responseFromServer = await fetch('/rand_response');
    const textFromResponse = await responseFromServer.text();
    const textContainer = document.getElementById('text-container');
    textContainer.innerText = textFromResponse;
}