# TicTacToe Project

***

Simple game made using JavaFX standard library

### **Tasks to be implemented**

* Create a two input fields for the two players to write their names at the start of the game
* Assign each player to *X* or *O* randomly, since *X* always starts first in our game, we want to give the two players equal chances to start first
* At the end of the game save the winners data to the CSV file **PlayerData.csv**, if the player already exists increase his score by 1
* Use the HelloController & hello-view.fxml files as an example to make the dashboard, 
* Side task, you can create a class in the root package, lets call it GameState, it will containes the variables that will be used in the main game, such as the whose turn it is, the names of the players, and the game score as a static variables  

*Note*
FXML is a markup language made to define user interfaces without the need to write complex Java styling code,
all principles such as positioning and the code we made yesterday still valid, it only help us create the main interface faster.
you can use JavaFX SceneBuilder to create interfaces in a drag and drop style without the need to write the code

if you check hello-view.fxml you will find that the two elements, the list and the label have two uinque IDs corresponds to the two class parameters, and must have the same name to work properly     

***

### Useful Resources

* [Set up SceneBuilder with Intellij](https://www.jetbrains.com/help/idea/opening-fxml-files-in-javafx-scene-builder.html#open-in-scene-builder
  )
* [Set up SceneBuilder with eclipse](https://o7planning.org/10621/install-javafx-scene-builder-for-eclipse)

* [Read data from CSV file](https://www.baeldung.com/java-csv-file-array)

* [Write data to CSV file](https://www.baeldung.com/java-csv)