# A Simple CRUD app in Java
A Bookings app using Java and Sqlite

# Running
To run the app, open the app in VS code, open the App.java file, and select `Run without debugging` from the `Run` menu.
You'll need to have the `Extension Pack for Java` and `Gradle for Java` extensions installed.

Running the App creates a localhost server on port `8000`.
There is an html page at `localhost:8000` which can be used to send requests to the REST endpoints.
The REST endpoint is at `localhost:8000/v1/bookings`, which responds to GET and POST methods.
You usually have to pass the `day` query parameter, e.g. `localhost:8000/v1/bookings?day=2014-01-01`.

The App creates a sqlite database `bookings.db` if one does not already exist.

# Testing
To run the tests, open the app in VS code, go to the testing panel and run the tests.

# Code Organization
There are three parts which can be seen by following the `main` function in `App.java`.

1. First there is some preamble to get a Database object.
2. Then there's a call to `addHandler` to respond to POST requests. This uses the `BookingsPostHandler` class which is one of the major parts of the code base.
3. Lastly there's another call to `addHandler` for GET requests which uses a lambda. The body of this lambda is the final major part of this code base.