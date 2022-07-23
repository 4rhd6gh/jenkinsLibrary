def call( String gitCommitTag ){
    def resultado = new StringBuilder()
    def error     = new StringBuilder()
    println 'git commit Tag' + gitCommitTag
        
    
    def comando = "docker build -t gitCommitTag .".execute()
    comando.consumeProcessOutput(resultado, error)
    comando.waitForOrKill(1000) 
    def comando2 = "docker tag gitCommitTag gitCommitTag:latest".execute()
    comando2.consumeProcessOutput(resultado, error)
    comando2.waitForOrKill(1000) 

}