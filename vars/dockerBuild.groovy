def call( String gitCommitTag ){
    
    println 'git commit Tag' + gitCommitTag
    "docker build -t gitCommitTag .".execute()
    "docker tag gitCommitTag gitCommitTag:latest".execute()
}