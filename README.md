# Quotes

This file contain the 8th lab of java401d5 course.

and it contains:

1. **main** the starting point that accept an array of String (args) and will do certain things depend on the entered
   args [usage](#usage)
2. **qouteByWord** method will take the offline quotes list and filter it according if the qoute contain that specific
   word.
3. **qouteByAuthor** method will take the offline quotes list and filter it according if the author is the same as
   entered by the user.
4. **qouteByTags** method will take the offline quotes list and filter it according to the tags
5. **Qoute** Class for storing and organize the quotes we read from the json file.
6. **OnlineQoutes** Class for storing and dealing with online quotes we got from the api.

## Usage

> note that you have to implement the Gson library inside gradle project before running these command, to know how to import it click [here](#importing)

The main function accept argument through gradle run app and have two mode:

1. Online mode:
   You can access it through command `$ gradle run --args="online"` or `$ gradle run` this will look through an online
   api and will print the randomly quote fetched from the internet and will store it to local folder to use again later:
   > if you have problem connecting to the api the mode will be switched to offline automatically.
2. Offline mode:
   You can access it through the command `$ gradle run --args="offline"` this will print random quote from local file
   you have it in the project folder, You can filter the offline quotes by three-way:
    1. By author name: you can filter the quote by this command `$ gradle run --args="author Charles"` for example if we
       want to search for a quote by Charles.
    2. By word in the quote: you can filter the quote by this command `$ gradle run --args="contains woman"` for example
       if we are searching for quotes that contains the word "woman".
    3. By tag: you can filter the quote by this command `$ gradle run --args="tags coffee"` for example if we want to
       search for quote that it's tag contains the word "coffee".
       > if you want to filter for the previous online you use the tag "online" `$ gradle run --args="tags online"`

### importing

1. open the project folder inside your preferred IDE then open file name "build.gradle"
2. copy and paste this line inside the dependencies in that folder "implementation 'com.google.code.gson:gson:2.8.8'"

![implement the library](./gradleDep.png)
