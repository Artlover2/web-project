<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Interactive Webpage</title>
  <style>
    .hidden {
      display: none;
    }
  </style>
</head>
<body>

  <h1>Interactive Webpage</h1>

  <form id="myForm">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br>
    <button type="submit">Submit</button>
  </form>

  <div id="hiddenElement" class="hidden">
    <p>This is a hidden element. Click the button below to toggle its visibility.</p>
    <button id="toggleButton">Toggle Visibility</button>
  </div>

  <script>
    document.getElementById("myForm").addEventListener("submit", function(event) {
      event.preventDefault(); // Prevent form submission
      var name = document.getElementById("name").value;
      var email = document.getElementById("email").value;

      if (name && email) {
        alert("Form submitted successfully!");
        // Here you can perform further actions, like sending data to a server
      } else {
        alert("Please fill out all fields.");
      }
    });

    document.getElementById("toggleButton").addEventListener("click", function() {
      var hiddenElement = document.getElementById("hiddenElement");
      if (hiddenElement.classList.contains("hidden")) {
        hiddenElement.classList.remove("hidden");
      } else {
        hiddenElement.classList.add("hidden");
      }
    });
  </script>

</body>
</html>
