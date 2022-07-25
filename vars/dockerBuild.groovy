def call( String gitCommitTag, String gitPreCommitTag, String systemName ){

    println 'System:========== ' + systemName
    println 'git commit Tag:========== ' + gitCommitTag
    println 'git pre commit Tag:========== ' + gitPreCommitTag
    
    def dockerBuildTag = systemName + '-' + gitCommitTag

    sh """
    docker build -t "${dockerBuildTag}" .
    """
}