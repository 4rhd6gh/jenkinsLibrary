def call( String gitCommitTag ){
    println 'git commit Tag' + gitCommitTag
    
    def stdout = new StringWriter()
    def stderr = new StringWriter()
    ['/bin/sh', '-c', "docker build -t "+gitCommitTag].execute().waitForProcessOutput(stdout, stderr)

    println "OUTPUT: " + stdout.toString()
    println "ERRORS: " + stderr.toString()

}