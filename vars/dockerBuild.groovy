def call( String gitCommitTag ){
    println 'git commit Tag' + gitCommitTag
    
    sh """
    docker build -t ${gitCommitTag} .
    """
}