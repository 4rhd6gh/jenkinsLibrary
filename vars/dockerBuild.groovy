def call( String gitCommitTag, String gitPreCommitTag, String systemName ){

    println 'System:========== ' + systemName
    println 'git commit Tag:========== ' + gitCommitTag
    println 'git pre commit Tag:========== ' + gitPreCommitTag
    
    sh """

    docker build -t ${systemName gitCommitTag} .
    """
}