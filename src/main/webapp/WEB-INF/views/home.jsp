<!DOCTYPE html>
<html lang="en">
<head>
  <title>Spring Portal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>WELCOME</h2>
  <form class="form-inline" action="/action_page.php">
    <label for="username" class="mb-2 mr-sm-2">Username:</label>
    <input type="text" class="form-control mb-4 mr-sm-4" id="username" placeholder="Enter username" name="username">
    <label for="pwd2" class="mb-2 mr-sm-2">Password:</label>
    <input type="text" class="form-control mb-4 mr-sm-4" id="pwd2" placeholder="Enter password" name="password">
    <button type="submit" class="btn btn-primary mb-2">Submit</button>
  </form>
</div>

</body>
</html>