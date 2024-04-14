document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
  
    if (name && email) {
      fetch('/submit-form', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, email })
      })
      .then(response => response.text())
      .then(data => {
        console.log(data); // Log server response
        alert(data); // Show server response as an alert
      })
      .catch(error => console.error('Error:', error));
    } else {
      alert("Please fill out all fields.");
    }
  });