# MAD Practical 7 — JSON API & SQLite Database

## 📱 Android Application

**Practical:** Mobile Application Development — Practical 7
**Enrollment No.:** 25172022051
**Name:** Yash Patel
**Platform:** Android Studio
**Language:** Kotlin
**Database:** SQLite
**API/Data Format:** JSON
**Repository:** `25172022051_MAD_PRACTICAL_7`

---

## 🎯 AIM

> **Develop an Android application that retrieves person data in JSON format from an internet API and stores the retrieved data in an SQLite database.**

The application retrieves person/contact information from an internet-based JSON API, converts the JSON data into Kotlin objects, and displays the retrieved records using a **RecyclerView/ListView**.

The retrieved person data is also stored locally in an **SQLite database** so that the application can maintain the data locally.

---

## 📚 STUDY

The following Android and Kotlin concepts are studied and implemented in this practical:

* JSON Format
* ListView
* RecyclerView
* HttpURLConnection
* CoroutineScope
* Internet Permission
* SQLite Database
* JSON Parsing
* RecyclerView Adapter
* Serializable
* API Communication
* Background Network Operations

### References

* [Kotlin CoroutineScope Documentation](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/)
* [JSON Generator](https://app.json-generator.com/)

---

## 📝 PRACTICAL DESCRIPTION

Create an Android application that retrieves **Contact/Person information in JSON format** from an internet URL.

The JSON data contains information such as:

* ID
* First Name
* Last Name
* Phone Number
* Email ID
* Address
* Latitude
* Longitude

The application performs the following operations:

1. Connects to the JSON API URL.
2. Retrieves JSON data from the internet.
3. Parses the JSON response.
4. Converts JSON objects into `Person` objects.
5. Stores the retrieved data in an SQLite database.
6. Displays the person records using RecyclerView/ListView.
7. Handles internet communication using `HttpURLConnection`.
8. Uses `CoroutineScope` for background operations.

---

# ✨ Features

* 🌐 Retrieve JSON data from an internet API
* 👤 Display person/contact information
* 📋 RecyclerView/ListView based data display
* 💾 Store data locally using SQLite
* 🔄 Fetch data from an online JSON URL
* 📦 Convert JSON data into Kotlin objects
* 🧵 Perform network operations using CoroutineScope
* 🔐 Internet permission handling
* 📍 Store address and location information
* 📱 Simple and user-friendly Android interface

---

# 📊 Person Data Fields

The application uses a `Person` class containing the following fields:

| Field       | Description          |
| ----------- | -------------------- |
| `id`        | Unique person ID     |
| `firstName` | Person's first name  |
| `lastName`  | Person's last name   |
| `phone`     | Phone number         |
| `email`     | Email address        |
| `address`   | Person's address     |
| `latitude`  | Latitude coordinate  |
| `longitude` | Longitude coordinate |

---

# 🧾 JSON Data Format

The application uses JSON data generated using **JSON Generator**.

Example JSON structure:

```json
[
  {
    "id": 1,
    "firstName": "Yash",
    "lastName": "Patel",
    "phone": "9876543210",
    "email": "yash@example.com",
    "address": "Ahmedabad, Gujarat",
    "latitude": 23.0225,
    "longitude": 72.5714
  },
  {
    "id": 2,
    "firstName": "Rahul",
    "lastName": "Shah",
    "phone": "9876543211",
    "email": "rahul@example.com",
    "address": "Ahmedabad, Gujarat",
    "latitude": 23.0300,
    "longitude": 72.5800
  }
]
```

> The actual JSON URL used in the application can be generated from [JSON Generator](https://app.json-generator.com/).

---

# 🏗️ Application Architecture

The application follows a simple flow:

```text
        ┌──────────────────────┐
        │     MainActivity     │
        └──────────┬───────────┘
                   │
                   ▼
        ┌──────────────────────┐
        │   HttpRequest Class  │
        │  HttpURLConnection   │
        └──────────┬───────────┘
                   │
                   ▼
        ┌──────────────────────┐
        │     JSON API URL     │
        └──────────┬───────────┘
                   │
                   ▼
        ┌──────────────────────┐
        │     JSON Response    │
        └──────────┬───────────┘
                   │
                   ▼
        ┌──────────────────────┐
        │    JSON Parsing      │
        └──────────┬───────────┘
                   │
                   ▼
        ┌──────────────────────┐
        │    Person Objects    │
        └───────┬───────┬──────┘
                │       │
                ▼       ▼
      ┌─────────────┐  ┌───────────────┐
      │ SQLite DB   │  │  RecyclerView │
      └─────────────┘  └───────────────┘
```

---

# 🔄 Application Working

### Step 1 — Start Application

The user opens the Android application.

### Step 2 — Connect to API

The application uses the JSON URL generated through JSON Generator.

### Step 3 — HTTP Request

The `HttpRequest` class establishes a connection with the web URL using:

```text
HttpURLConnection
```

### Step 4 — Retrieve JSON

The server returns person/contact information in JSON format.

### Step 5 — Parse JSON

The JSON response is parsed and converted into Kotlin `Person` objects.

### Step 6 — Store Data

The retrieved person information is inserted into the local SQLite database.

### Step 7 — Display Data

The data is displayed in the application using a:

```text
RecyclerView / ListView
```

### Step 8 — CoroutineScope

Network and database operations are performed in the background using Kotlin Coroutines to prevent blocking the main UI thread.

---

# 📁 Project Structure

The project contains the following important components:

```text
25172022051_MAD_PRACTICAL_7
│
├── app
│   │
│   └── src
│       └── main
│           │
│           ├── java/com/example/25172022051_MAD_PRACTICAL_7/
│           │   │
│           │   ├── MainActivity.kt
│           │   ├── Person.kt
│           │   ├── HttpRequest.kt
│           │   ├── DatabaseHelper.kt
│           │   └── PersonAdapter.kt
│           │
│           ├── res
│           │   ├── layout
│           │   │   ├── activity_main.xml
│           │   │   └── item_person.xml
│           │   │
│           │   └── values
│           │       ├── colors.xml
│           │       ├── strings.xml
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

> The exact file structure may vary slightly depending on the Android Studio project configuration.

---

# 👤 Person Class

The `Person` class represents an individual contact/person retrieved from the JSON API.

The class contains:

```text
id
firstName
lastName
phone
email
address
latitude
longitude
```

The class is made `Serializable` so that Person objects can be serialized when required.

Example structure:

```kotlin
data class Person(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val email: String,
    val address: String,
    val latitude: Double,
    val longitude: Double
) : Serializable
```

---

# 🌐 HttpRequest Class

The `HttpRequest` class is responsible for communicating with the JSON web URL.

It uses:

```text
HttpURLConnection
```

to establish the internet connection.

The basic process is:

```text
URL
 ↓
HttpURLConnection
 ↓
InputStream
 ↓
Read JSON Response
 ↓
Return JSON String
```

---

# 📡 Internet Permission

Internet permission is added to the Android Manifest because the application needs to access the online JSON API.

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

Network state permission can also be included:

```xml
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

---

# 🧵 CoroutineScope

Kotlin `CoroutineScope` is used to perform network and database operations without blocking the main UI thread.

General flow:

```text
Main Thread
     │
     ▼
CoroutineScope
     │
     ├── Internet Request
     │
     ├── JSON Parsing
     │
     └── SQLite Operation
```

This helps keep the application responsive while retrieving data from the internet.

---

# 📋 RecyclerView

RecyclerView is used to display multiple person records efficiently.

Each item can display information such as:

```text
Name
Phone Number
Email
Address
Latitude
Longitude
```

Example:

```text
┌─────────────────────────────────┐
│ Yash Patel                      │
│ 📞 9876543210                   │
│ ✉ yash@example.com              │
│ 📍 Ahmedabad, Gujarat           │
└─────────────────────────────────┘
```

---

# 💾 SQLite Database

The application stores retrieved person data locally using SQLite.

### Database Table

Example table:

```text
Person
```

| Column    | Type    |
| --------- | ------- |
| id        | INTEGER |
| firstName | TEXT    |
| lastName  | TEXT    |
| phone     | TEXT    |
| email     | TEXT    |
| address   | TEXT    |
| latitude  | REAL    |
| longitude | REAL    |

### Database Flow

```text
JSON API
   ↓
JSON Data
   ↓
Person Object
   ↓
SQLite Database
   ↓
RecyclerView
```

---

# 🔗 JSON Generator

The JSON data for this practical can be generated using:

**JSON Generator**

https://app.json-generator.com/

The generated URL is then used in the Android application to retrieve the person data.

---

# 🛠️ Technologies Used

| Technology        | Purpose                 |
| ----------------- | ----------------------- |
| Kotlin            | Application development |
| Android Studio    | Development environment |
| XML               | User interface          |
| JSON              | Data exchange format    |
| HttpURLConnection | Internet communication  |
| CoroutineScope    | Background operations   |
| SQLite            | Local database          |
| RecyclerView      | Displaying records      |
| Serializable      | Object serialization    |

---

# 📋 Practical Requirements

The application fulfills the following practical requirements:

* [x] Create `MainActivity`
* [x] Design the required UI
* [x] Generate JSON data
* [x] Use JSON URL
* [x] Create `Person` class
* [x] Include Person fields
* [x] Implement `Serializable`
* [x] Parse JSON data
* [x] Use RecyclerView/ListView Adapter
* [x] Add Internet Permission
* [x] Create `HttpRequest` class
* [x] Communicate with Web URL
* [x] Store retrieved data in SQLite
* [x] Use Kotlin CoroutineScope

---

# ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/yashPatel228/25172022051_MAD_PRACTICAL_7.git
```

### 2. Open in Android Studio

Open the cloned project using:

```text
Android Studio
```

### 3. Sync Gradle

Allow Android Studio to download and synchronize all required dependencies.

### 4. Connect Android Device

Connect an Android phone using USB debugging or start an Android Emulator.

### 5. Run Application

Click:

```text
Run ▶
```

The application will be installed on the selected Android device/emulator.

---

# 📱 Expected Application Flow

```text
Launch Application
        ↓
    MainActivity
        ↓
  Request JSON Data
        ↓
    Internet API
        ↓
    JSON Response
        ↓
    Parse JSON
        ↓
 Create Person Objects
        ↓
 ┌───────────────┐
 │               │
 ▼               ▼
SQLite DB    RecyclerView
 │               │
 └───────┬───────┘
         ▼
   Display Person
       Data
```

---

# 🧪 Testing

The following tests can be performed:

### Test 1 — Internet Connection

Verify that the device has an active internet connection.

### Test 2 — API Response

Verify that the JSON URL returns valid JSON data.

### Test 3 — JSON Parsing

Verify that all person fields are correctly parsed.

### Test 4 — RecyclerView

Verify that all retrieved persons are displayed correctly.

### Test 5 — SQLite

Verify that retrieved records are inserted into the local SQLite database.

### Test 6 — Multiple Records

Verify that multiple JSON records are displayed correctly.

---

# ⚠️ Important Notes

* Internet permission must be present in `AndroidManifest.xml`.
* A valid JSON URL must be configured in the application.
* The JSON structure should match the fields expected by the `Person` class.
* Network operations should not be performed directly on the main UI thread.
* CoroutineScope is used to perform background operations.
* SQLite provides local storage for the retrieved records.
* RecyclerView is used for displaying multiple records efficiently.

---

# 🎓 Learning Outcomes

After completing this practical, the following concepts are understood:

1. How JSON data is structured.
2. How to generate JSON data using an online tool.
3. How to retrieve data from an internet API.
4. How `HttpURLConnection` works.
5. How to parse JSON data in Kotlin.
6. How to create and use a Serializable data class.
7. How to use RecyclerView/ListView Adapter.
8. How to use Kotlin CoroutineScope.
9. How to store data using SQLite.
10. How Android applications communicate with web APIs.

---

# 📸 Screenshots

Add screenshots of your completed application here.

### Main Screen

```text
Add your MainActivity screenshot here.
```

### Person List

```text
Add your RecyclerView/ListView screenshot here.
```

### JSON Data

```text
Add your JSON Generator/API response screenshot here.
```

### SQLite Database

```text
Add your database screenshot here.
```

---

# 👨‍💻 Student Information

| Information        | Details                        |
| ------------------ | ------------------------------ |
| **Name**           | Yash Patel                     |
| **Enrollment No.** | 25172022051                    |
| **Practical**      | MAD Practical 7                |
| **Subject**        | Mobile Application Development |
| **Language**       | Kotlin                         |
| **Platform**       | Android Studio                 |
| **Database**       | SQLite                         |

---

# 📌 Conclusion

This practical demonstrates how an Android application can communicate with an internet-based API, retrieve person/contact information in **JSON format**, parse the received data, store it in a local **SQLite database**, and display the information using **RecyclerView/ListView**.

The practical also provides hands-on experience with **HttpURLConnection**, **CoroutineScope**, **JSON parsing**, **Serializable**, **RecyclerView Adapter**, and **SQLite database operations**.

---

## 🔗 Repository

**GitHub Repository:**

https://github.com/yashPatel228/25172022051_MAD_PRACTICAL_7

---

## 📚 References

* Kotlin Documentation: https://kotlinlang.org/
* Android Developers: https://developer.android.com/
* JSON Generator: https://app.json-generator.com/
* Kotlin CoroutineScope: https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/

---

**Made for Mobile Application Development Practical 7**
**© Yash Patel — 25172022051**
