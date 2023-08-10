fun main(){
   var values = IntArray(8)
println(values)
    var isGameOver : Boolean = false
   loop@  while(!isGameOver) {
    
        println("Yes, of course!.")
        println("Ask a Yes or No Question.")
        println("Without a doubt, yes.")
        println("You can count on it.")
        println("For sure!")
        println("Ask me later.")
        println("I’m not sure.")
        println("I can’t tell you right now.")
        println("To exit the game, simply type in Exit.")
  
      val guessUser = "userSide"; "getUserInput()"
    
    
        if(guessUser == "Exit" || guessUser == "exit"){
            println("Thanks for playing!")
            break
        } else ifguessUser == ""){ 
            println("Please put in a valid answer.")
            continue@loop 
        }

        println("User: $guessUser.")
   }
 }
