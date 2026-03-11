<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>User Registration</title>

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />

    <style>
      body {
        background-image: url("../images/housebg.png");
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        margin: 0;
      }

      .overlay {
        background-color: rgba(255, 255, 255, 0.4);
        min-height: 100vh;
        display: flex;
        flex-direction: column;
      }

      .main-container {
        flex: 1;
        display: flex;
        justify-content: center;
        align-items: center;
      }
    </style>

    <script>
      function registerUser() {
        alert("Registration Successful!");

        window.location.href = "login.html";

        return false;
      }
    </script>
  </head>

  <body>
    <div class="overlay">
      <!-- Navbar -->

         <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="home">RentPredictApp</a>

        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav me-auto">
            <li class="nav-item">
              <a class="nav-link" href="home">Home</a>
            </li>

            <li class="nav-item">
              <a class="nav-link active" href="about">About</a>
            </li>

            <li class="nav-item">
              <a class="nav-link" href="contact">Contact</a>
            </li>
          </ul>

          <div>
             <a href="lg" class="btn btn-primary me-3">Login</a>
            <a href="reg" class="btn btn-outline-info">Register</a>
          </div>
        </div>
      </div>
    </nav>

      <!-- Registration Form -->

      <div class="main-container">
        <div class="card shadow p-4" style="width: 400px">
          <h3 class="text-center mb-4">Register Here</h3>

          <form onsubmit="return registerUser();">
            <div class="mb-3">
              <label class="form-label">Enter Your Name</label>
              <input type="text" class="form-control" required />
            </div>

            <div class="mb-3">
              <label class="form-label">Email</label>
              <input type="email" class="form-control" required />
            </div>

            <div class="mb-3">
              <label class="form-label">Contact</label>
              <input type="text" class="form-control" required />
            </div>

            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" class="form-control" required />
            </div>

            <div class="d-grid gap-2">
              <button type="submit" class="btn btn-primary">Register</button>

              <button type="reset" class="btn btn-secondary">Cancel</button>
            </div>
          </form>
        </div>
      </div>

      <!-- Footer -->

      <footer class="bg-dark text-white text-center p-3">
        © 2026 Rental Price Prediction System
      </footer>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
