# Simple Invoice Generator System

This project is a simple system to generate invoice PDFs using:

- **Back-end:** Java + Spring Boot + iTextPDF
- **Front-end:** HTML + plain JavaScript

The user fills out a form with name, CPF (Brazilian ID), and address. The system responds with a downloadable PDF containing the invoice details.

---

## 📂 Project Structure

```
invoice-generator/
├── frontend/     → Contains HTML form and JS script to send data
│   └── index.html
├── backend/      → Spring Boot project responsible for PDF generation
│   ├── src/
│   └── pom.xml
└── README.md
```

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/invoice-generator.git
cd invoice-generator
```

### 2. Run the back-end

```bash
cd backend
./mvnw spring-boot:run
```

The application will run on:  
`http://localhost:8080`

---

### 3. Open the front-end

Open the file:

```
frontend/index.html
```

> Tip: Just double-click the file to open it in your browser. Make sure the back-end is running.

---

## ✅ Usage Example

1. Fill in the name, CPF, and address in the form.
2. Click **Generate PDF**.
3. A new tab will open with the PDF invoice.

---

## ⚙️ Technologies Used

- Java 21
- Spring Boot 3.4.5
- iTextPDF 5.5.13.4
- HTML5
- JavaScript
- CORS configuration included

---

## 🔒 Notes

- This project is for educational purposes only.
- In production, proper CORS configuration and input validation is recommended.
- No database is used – data is processed in-memory.

---

## 👨‍💻 Author

Roger Yamassaki – [GitHub](https://github.com/Skarefes)
