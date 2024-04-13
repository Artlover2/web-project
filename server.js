const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000; // Or any other port you prefer

// Middleware to parse JSON and URL-encoded form data
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

// Serve static files (HTML, CSS, JS)
app.use(express.static('public'));

// Handle form submissions
app.post('/submit-form', (req, res) => {
    // Access form data from req.body
    const formData = req.body;
    // Process the form data (e.g., save to a database)
    // Respond to the client
    res.send('Form submitted successfully!');
});

// Start the server
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}/`);
});