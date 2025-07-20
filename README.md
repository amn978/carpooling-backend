# 🚗 Carpooling System

A full-stack carpooling web application that allows users to register, login, create rides, and join available rides. Built using **Spring Boot** for the backend and **HTML/CSS/JavaScript** for the frontend.

---

## ✨ Features

- 🔐 User Authentication (JWT-based login and registration)
- 🚘 Create and Join Rides
- 📦 RESTful APIs with Spring Boot
- 🌐 Responsive frontend UI using HTML/CSS/JS
- ✅ Protected routes after login
- 🔗 Backend and frontend hosted on Railway and Netlify

---

## 🚀 How to Run Locally

### Backend (Spring Boot)

1. **Clone the repo**  
   ```bash
   git clone https://github.com/amn978/carpooling-backend.git
   cd carpooling-backend
Build the project
Make sure you have Java 17+ and Maven installed.

bash
Copy
Edit
mvn clean install
Run the backend

bash
Copy
Edit
mvn spring-boot:run
Backend will be available at: http://localhost:8080

Frontend
Navigate to the frontend folder
Make sure it contains:

cpp
Copy
Edit
├── login.html
├── register.html
├── ride.html
├── style.css
└── script.js
Update API endpoint
In script.js, change https://your-backend-url.com to http://localhost:8080 if running locally.

Open the app
Open login.html in your browser to start using the app.

🛠️ Tech Stack
Layer	Technology
Frontend	HTML, CSS, JavaScript
Backend	Java, Spring Boot
Authentication	JWT (JSON Web Token)
Deployment	Railway (Backend), Netlify (Frontend)
Version Control	Git & GitHub

 Live Demo
🌍 Frontend: https://carpooling-frontend.netlify.app

🛠️ Backend API: https://carpooling-backend-production.up.railway.app
