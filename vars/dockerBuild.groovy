def call( String gitCommitTag ){
    def resultado = new StringBuilder()
    def error     = new StringBuilder()
    println 'git commit Tag' + gitCommitTag
        
    
    String comando = "docker build -t gitCommitTag .".execute().text
    println comando
    
    String comando2 = "docker tag gitCommitTag gitCommitTag:latest".execute().text
    println comando2

}