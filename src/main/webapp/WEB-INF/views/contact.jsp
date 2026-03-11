<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact - Rental Price Estimation</title>

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>

  <body class="bg-light d-flex flex-column min-vh-100">
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

    <!-- Contact Section -->
    <div class="container mt-5 flex-grow-1">
      <div class="row align-items-center mt-4">
        <!-- Left Image -->
        <div class="col-md-6 text-center">
          <img
             src="<%= request.getContextPath()%>/resources/img/contactImg.avif"
            class="img-fluid"
            style="max-width: 500px"
            alt="Contact Image"
          />
        </div>

        <!-- Contact Form -->
        <div class="col-md-6">
          <div class="card shadow p-4">
            <h3 class="mb-3 text-center">Contact Us</h3>

            <form>
              <div class="mb-3">
                <label class="form-label">Full Name</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Enter your name"
                />
              </div>

              <div class="mb-3">
                <label class="form-label">Email</label>
                <input
                  type="email"
                  class="form-control"
                  placeholder="Enter your email"
                />
              </div>

              <div class="mb-3">
                <label class="form-label">Message</label>
                <textarea
                  class="form-control"
                  rows="4"
                  placeholder="Write your message"
                ></textarea>
              </div>

              <button type="submit" class="btn btn-success w-100">
                Send Inquiry
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>

    <!-- Footer -->
    <footer class="bg-dark text-light pt-4 mt-auto">
      <div class="container">
        <div class="row">

        <!-- Copyright -->
        <div class="text-center pb-3">
          © 2026 Rental Price Estimation System | All Rights Reserved
        </div>
      </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
