function create(){
  const name = document.getElementById('name').value;

  fetch('/save_user', {
    method: 'POST',
    body: JSON.stringify({ name }),
    headers: { 'Content-Type': 'application/json' }
  })
    .then(response => response.text())
    .then(data => {
      document.getElementById('response').innerHTML = data;
    })
    .catch(error => {
      console.error(error);   

      document.getElementById('response').innerHTML = "Error creating user!";
    });

}